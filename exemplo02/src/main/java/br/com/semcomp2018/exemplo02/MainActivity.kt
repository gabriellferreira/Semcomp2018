package br.com.semcomp2018.exemplo02

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val MAX_DICE_NUMBER = 20
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        botao_sortear?.setOnClickListener {
            randomNumber()
        }
    }

    private fun randomNumber() {
        val rand = Random()
        val value = rand.nextInt(MAX_DICE_NUMBER)

        if (value == 0) {
            randomNumber()
        }
        writeNumberServer(value)
        numero_sorteado.text = value.toString()
    }

    private fun writeNumberServer(dadoNumber: Int) {
    }
}

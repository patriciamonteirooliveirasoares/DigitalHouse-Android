package com.patriciasoares.aula16_exemploaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMostrarResultado.setOnClickListener {
            val numero = numEntrada.text.toString().toInt()

            if (ehPar(numero)) {
                txtResultado.text = getString(R.string.mensagemPar, numero)
            } else{
                txtResultado.text = getString(R.string.mensagemImpar, numero)
            }

        }
    }

    fun ehPar(num: Int): Boolean {
        return num % 2 == 0
    }
}
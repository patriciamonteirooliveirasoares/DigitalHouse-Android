package com.patriciasoares.aula16_exerciciosalariohora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {
            val horasTrabalhadas = txtHorasTrabalhadas.text.toString().toInt()
            val valorHora = txtValorHora.text.toString().toInt()
            val salario = valorHora * horasTrabalhadas

            txtResultado.text = getString(R.string.resultado, salario)

        }



    }
}
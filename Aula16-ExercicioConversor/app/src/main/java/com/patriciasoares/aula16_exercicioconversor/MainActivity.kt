package com.patriciasoares.aula16_exercicioconversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConverter.setOnClickListener {
            val temperaturaC = edtTemperatura.text.toString().toInt()
            val temperaturaF = ((temperaturaC * 9) / 5) + 32

            txtResultado.text = getString(R.string.resultado, temperaturaF)

        }


    }
}
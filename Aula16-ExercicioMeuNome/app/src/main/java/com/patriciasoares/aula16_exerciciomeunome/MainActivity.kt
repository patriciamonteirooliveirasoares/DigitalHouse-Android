package com.patriciasoares.aula16_exerciciomeunome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<EditText>(R.id.txtNomeEntrada)

        val findViewById = findViewById<TextView>(R.string.nomeResultado)

        btnExibir.setOnClickListener {
            txtNomeResultado.text = txtNomeEntrada.text.toString()
        }

    }
}
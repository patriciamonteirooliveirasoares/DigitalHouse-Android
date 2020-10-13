package com.patriciasoares.aula19_exemploaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nova_tela.*

class NovaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova_tela)

        val name = intent.getStringExtra("NAME")
        val idade = intent.getIntExtra("IDADE", 0)

        txtName.text = name + " " + idade

    }
}


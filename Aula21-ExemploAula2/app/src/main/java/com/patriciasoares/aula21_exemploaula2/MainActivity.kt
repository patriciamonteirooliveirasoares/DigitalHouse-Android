package com.patriciasoares.aula21_exemploaula2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), iClicou {
    val segundoFragment = FragmentSecond()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager

        val transaction = manager.beginTransaction()
            transaction.add(R.id.container, FragmentOne())
            transaction.commit()

        val transaction2 = manager.beginTransaction()
        transaction2.add(R.id.segundoContainer, FragmentSecond())
        transaction2.commit()

    }

    override fun clicou(texto: String) {
        txtPadrao.text = texto

        segundoFragment.mudarTexto(texto)
    }
}
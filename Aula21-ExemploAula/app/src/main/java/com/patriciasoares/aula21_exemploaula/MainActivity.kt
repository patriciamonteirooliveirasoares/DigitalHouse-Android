package com.patriciasoares.aula21_exemploaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var manager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager = supportFragmentManager

        val fragmentExemplo = FragmentExemplo()
        val fragmentExemplo2 = FragmentExemplo2()

        fun addFragment (fragment: Fragment) {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.meuFragment, fragment)
            transaction.commit()
        }

        btnOne.setOnClickListener {
            addFragment(fragmentExemplo)
        }

        btnTwo.setOnClickListener {
            addFragment(fragmentExemplo2)
        }


    }


}
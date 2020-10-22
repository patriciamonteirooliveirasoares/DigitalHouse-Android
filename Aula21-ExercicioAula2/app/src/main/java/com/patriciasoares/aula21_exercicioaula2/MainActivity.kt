package com.patriciasoares.aula21_exercicioaula2

import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.FragmentManager
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.fragment_a.*
import java.util.*
import java.util.Calendar.*

class MainActivity() : AppCompatActivity(), ICalcular {
    lateinit var manager: FragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager = supportFragmentManager

        val fragmentA = FragmentA()
        val fragmentB = FragmentB()

        val transaction = manager.beginTransaction()
        transaction.replace(R.id.container1, fragmentA)
        transaction.commit()

        val transaction2 = manager.beginTransaction()
        transaction2.replace(R.id.container2, fragmentB)
        transaction2.commit()
    }

    override fun calcularIdade(nome: String, idade: Int) {
        super.calcularIdade(nome, idade)
        var anoAtual = Calendar.getInstance().get(Calendar.YEAR).toInt()
        var idade = anoAtual - edtAnoNasc
    }

}

private operator fun Int.minus(edtAnoNasc: TextInputLayout?): Any {
 return Any()
}

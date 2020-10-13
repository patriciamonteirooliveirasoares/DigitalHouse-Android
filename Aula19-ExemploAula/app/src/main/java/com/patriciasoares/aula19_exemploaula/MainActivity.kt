package com.patriciasoares.aula19_exemploaula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCliqueAqui.setOnClickListener {
            Toast.makeText(this, "Testando o toast", Toast.LENGTH_SHORT).show()
        }

        cbxEscolha.setOnCheckedChangeListener { compoundButton, b ->
            btnCliqueAqui.isEnabled = b
        }

    }
}
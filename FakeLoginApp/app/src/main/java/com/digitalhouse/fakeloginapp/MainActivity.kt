package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreat.setOnClickListener {
            val intent = Intent(this, NovaTelaLogin::class.java)
            startActivity(intent)
        }


        btnLogIn.setOnClickListener {
            val email = edtEmail.text.toString()
            val senha = edtPassword.text.toString()

            if (email.isEmpty()) {
                edtEmail.error = "Campo vazio"
            } else {
                try {
                    UserService.logIn(email, senha)
                    val intent = Intent(this, TelaWelcome::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                    Toast.makeText(this, "Usuário não cadastrado", Toast.LENGTH_LONG).show()
                }
            }
        }


    }
}
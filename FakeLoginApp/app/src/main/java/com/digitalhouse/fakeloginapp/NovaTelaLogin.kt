package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_nova_tela_login.*

class NovaTelaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova_tela_login)

        btnSULogIn.setOnClickListener {
            finish()
        }

        cxbIHave.setOnCheckedChangeListener { _, b ->
            btnSignUp.isEnabled = b
        }

        btnSULogIn.setOnClickListener {
            val nome = edtName.text.toString()
            val email = edtSUEmail.text.toString()
            val senha = edtSUPassword.text.toString()

            if (nome.isEmpty()) {
                edtName.error = "Campo vazio"
            } else {
                try {
                    UserService.register(nome, email, senha)
                    Toast.makeText(this, "Usuário cadastrado", Toast.LENGTH_LONG).show()
                    finish()
                } catch (e: Exception) {
                    Toast.makeText(this, "Usuário já cadastrado", Toast.LENGTH_LONG).show()
                }

            }

        }
    }

}
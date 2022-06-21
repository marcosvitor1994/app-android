package com.example.meuaplicativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val botaoSalvar = findViewById<Button>(R.id.btn_salvar)
        botaoSalvar.setOnClickListener {
            finish()
        }

        val botao2 = findViewById<Button>(R.id.btn_sair)
        botao2.setOnClickListener {
            val intencao = Intent(applicationContext, Login::class.java)
            startActivity(intencao)
        }
    }
}
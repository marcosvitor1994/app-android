package com.example.meuaplicativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class Lista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)


        val botao = findViewById<Button>(R.id.btn_add)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, Cadastro::class.java)
            startActivity(intencao)
        }

        val botao2 = findViewById<Button>(R.id.btn_sair)
        botao2.setOnClickListener {
            val intencao = Intent(applicationContext, Login::class.java)
            startActivity(intencao)
        }
    }
}
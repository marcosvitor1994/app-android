package com.example.meuaplicativo

import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val botao = findViewById<Button>(R.id.bt_entrar)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, Lista::class.java)
            startActivity(intencao)
        }

    }
}
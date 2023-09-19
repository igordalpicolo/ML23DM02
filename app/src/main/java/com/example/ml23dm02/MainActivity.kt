package com.example.ml23dm02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao =  findViewById<ImageButton>(R.id.btnproximo1)
        val nome = findViewById<EditText>(R.id.edtnome)
        val telefone = findViewById<EditText>(R.id.edttelefone)
        val botaofechar = findViewById<ImageButton>(R.id.btnfechar)

        botao.setOnClickListener {
            val pacote = Bundle ()
            pacote.putString("nome", nome.text.toString())
            pacote.putString("telefone", telefone.text.toString())

            val i = Intent(this, tela2::class.java)
            i.putExtras(pacote)
            startActivity(i)
        }

        botaofechar.setOnClickListener {
            finish()
        }

    }
}
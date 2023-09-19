package com.example.ml23dm02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)


        val nome = intent.extras!!.getString("nome")!!
        val email = intent.extras!!.getString("email")!!
        val telefone = intent.extras!!.getString("telefone")!!
        val publico = intent.extras!!.getString("publico")!!

        findViewById<TextView>(R.id.txtnome3).text = nome
        findViewById<TextView>(R.id.txtemail3).text = email
        findViewById<TextView>(R.id.txtTelefone3).text = telefone
        findViewById<TextView>(R.id.txtPublico3).text = publico
    }
}
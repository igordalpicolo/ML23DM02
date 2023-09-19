package com.example.ml23dm02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Button
import android.widget.ImageButton

class tela2 : AppCompatActivity() {

    private var publicoSelecionado: String = "não" // Variável para armazenar o estado do CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val nome = intent.extras!!.getString("nome")!!
        val telefone = intent.extras!!.getString("telefone")!!

        val email = findViewById<EditText>(R.id.edtemail)
        val publico = findViewById<CheckBox>(R.id.ckbpublico)
        val botao2 = findViewById<ImageButton>(R.id.btnProximo2) // Substitua "seu_botao_id" pelo ID do seu botão

        publico.setOnClickListener {
            // Verifique se o CheckBox está selecionado
            if (publico.isChecked) {
                // Se estiver selecionado, salve como "sim"
                publicoSelecionado = "sim"
            } else {
                // Se não estiver selecionado, salve como "não"
                publicoSelecionado = "não"
            }
        }

        botao2.setOnClickListener {
            val pacote = Bundle()

            pacote.putString("nome", nome)
            pacote.putString("telefone", telefone)
            pacote.putString("email", email.text.toString())
            pacote.putString("publico", publicoSelecionado)

            val i = Intent(this, tela3::class.java)
            i.putExtras(pacote)

            startActivity(i)
        }
    }
}

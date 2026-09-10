package com.br.projetoteste

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoConheca = findViewById<Button>(R.id.botaoConheca)
        val botaoDisciplinas = findViewById<Button>(R.id.botaoDisciplinas)

        botaoConheca.setOnClickListener {
            val intent = Intent(this, SobreCursoActivity::class.java)
            startActivity(intent)
        }

        botaoDisciplinas.setOnClickListener {
            val intent = Intent(this, DisciplinasActivity::class.java)
            startActivity(intent)
        }
    }
}

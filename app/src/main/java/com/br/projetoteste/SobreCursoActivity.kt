package com.br.projetoteste

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SobreCursoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre_curso)

        val botaoVoltar = findViewById<Button>(R.id.botaoVoltar)
        val botaoVerDisciplinas = findViewById<Button>(R.id.botaoVerDisciplinas)

        botaoVoltar.setOnClickListener {
            finish()
        }

        botaoVerDisciplinas.setOnClickListener {
            val intent = Intent(this, DisciplinasActivity::class.java)
            startActivity(intent)
        }
    }
}

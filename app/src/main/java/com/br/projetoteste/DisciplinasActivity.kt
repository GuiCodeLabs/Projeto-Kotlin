package com.br.projetoteste

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DisciplinasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas)

        val botaoProgramacao = findViewById<Button>(R.id.botaoProgramacao)
        val botaoBancoDados = findViewById<Button>(R.id.botaoBancoDados)
        val botaoEngenharia = findViewById<Button>(R.id.botaoEngenharia)
        val botaoWeb = findViewById<Button>(R.id.botaoWeb)
        val botaoMobile = findViewById<Button>(R.id.botaoMobile)
        val botaoIa = findViewById<Button>(R.id.botaoIa)
        val botaoVoltar = findViewById<Button>(R.id.botaoVoltarDisciplinas)

        botaoProgramacao.setOnClickListener {
            abrirDetalhes("Lógica de Programação")
        }

        botaoBancoDados.setOnClickListener {
            abrirDetalhes("Banco de Dados")
        }

        botaoEngenharia.setOnClickListener {
            abrirDetalhes("Engenharia de Software")
        }

        botaoWeb.setOnClickListener {
            abrirDetalhes("Desenvolvimento Web")
        }

        botaoMobile.setOnClickListener {
            abrirDetalhes("Desenvolvimento Mobile")
        }

        botaoIa.setOnClickListener {
            abrirDetalhes("Inteligência Artificial")
        }

        botaoVoltar.setOnClickListener {
            finish()
        }
    }

    private fun abrirDetalhes(nomeDisciplina: String) {
        val intent = Intent(this, DetalhesDisciplinaActivity::class.java)
        intent.putExtra("nome_disciplina", nomeDisciplina)
        startActivity(intent)
    }
}

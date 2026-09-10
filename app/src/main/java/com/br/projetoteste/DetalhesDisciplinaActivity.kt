package com.br.projetoteste

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesDisciplinaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_disciplina)

        val nomeDisciplina = intent.getStringExtra("nome_disciplina") ?: "Disciplina"

        var cargaHoraria = ""
        var modalidade = ""
        var nivel = ""
        var professor = ""
        var preRequisito = ""
        var descricao = ""

        when (nomeDisciplina) {
            "Lógica de Programação" -> {
                cargaHoraria = "80 horas"
                modalidade = "Presencial"
                nivel = "Básico"
                professor = "Prof. Leandro Melo"
                preRequisito = "Não possui"
                descricao = "Estuda algoritmos, variáveis, decisões e repetições para resolver problemas."
            }

            "Banco de Dados" -> {
                cargaHoraria = "80 horas"
                modalidade = "Presencial"
                nivel = "Intermediário"
                professor = "Prof. Ricardo Dantas"
                preRequisito = "Lógica de Programação"
                descricao = "Estuda modelagem de dados, bancos relacionais e comandos da linguagem SQL."
            }

            "Engenharia de Software" -> {
                cargaHoraria = "60 horas"
                modalidade = "Presencial"
                nivel = "Intermediário"
                professor = "Prof. Pedro Henrique"
                preRequisito = "Lógica de Programação"
                descricao = "Apresenta requisitos, documentação, testes e etapas do desenvolvimento de sistemas."
            }

            "Desenvolvimento Web" -> {
                cargaHoraria = "80 horas"
                modalidade = "Híbrida"
                nivel = "Intermediário"
                professor = "Prof. Jonatas Silva"
                preRequisito = "Lógica de Programação"
                descricao = "Ensina a criação de páginas utilizando HTML, CSS e JavaScript."
            }

            "Desenvolvimento Mobile" -> {
                cargaHoraria = "80 horas"
                modalidade = "Presencial"
                nivel = "Intermediário"
                professor = "Prof. Leandro Melo"
                preRequisito = "Lógica de Programação"
                descricao = "Estuda a criação de aplicativos Android e a programação com Kotlin."
            }

            "Inteligência Artificial" -> {
                cargaHoraria = "60 horas"
                modalidade = "Híbrida"
                nivel = "Avançado"
                professor = "Prof. Amanda Costa"
                preRequisito = "Banco de Dados"
                descricao = "Apresenta conceitos iniciais de inteligência artificial e aprendizado de máquina."
            }
        }

        findViewById<TextView>(R.id.textoNomeDisciplina).text = nomeDisciplina
        findViewById<TextView>(R.id.textoCargaHoraria).text = "Carga horária: $cargaHoraria"
        findViewById<TextView>(R.id.textoModalidade).text = "Modalidade: $modalidade"
        findViewById<TextView>(R.id.textoNivel).text = "Nível: $nivel"
        findViewById<TextView>(R.id.textoProfessor).text = "Professor: $professor"
        findViewById<TextView>(R.id.textoPreRequisito).text = "Pré-requisito: $preRequisito"
        findViewById<TextView>(R.id.textoDescricao).text = descricao

        val botaoVoltar = findViewById<Button>(R.id.botaoVoltarDetalhes)
        val botaoCompartilhar = findViewById<Button>(R.id.botaoCompartilhar)

        botaoVoltar.setOnClickListener {
            finish()
        }

        botaoCompartilhar.setOnClickListener {
            val mensagem = "$nomeDisciplina\n$cargaHoraria\n$modalidade\n\n$descricao"

            val intentCompartilhar = Intent(Intent.ACTION_SEND)
            intentCompartilhar.type = "text/plain"
            intentCompartilhar.putExtra(Intent.EXTRA_TEXT, mensagem)

            startActivity(Intent.createChooser(intentCompartilhar, "Compartilhar disciplina"))
        }
    }
}

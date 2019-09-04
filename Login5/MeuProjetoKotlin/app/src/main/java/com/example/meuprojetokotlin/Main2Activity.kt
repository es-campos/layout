package com.example.meuprojetokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val listaDeLivros = listOf<Livros>(
            Livros("Harry Potter", "Aventura"),
        Livros("O Senhor dos Anéis", "Aventura"),
        Livros("Cinquenta Tons de Cinza", "Sadomasoquismo"))

        listView.setAdapter(ListaAdapter(listaDeLivros, this))

    }
}

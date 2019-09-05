package com.example.meuprojetokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//        val listaDeLivros = listOf<Livros>(
//            Livros("Harry Potter", "Aventura"),
//        Livros("O Senhor dos Anéis", "Aventura"),
//        Livros("Cinquenta Tons de Cinza", "Sadomasoquismo"))

        val buscaTodos = listOf<Livros>(Livros(id = 0, nome = "Nome", genero = "Genero"),
            Livros (nome = "Emerson", genero = "Dog", id = 1))

//        val dao = Room.databaseBuilder(applicationContext, DataBaseLivro :: class.java, "meudb")
//            .allowMainThreadQueries()
//            .build()
//            .getDao()
//
//        dao.inserir(Livros(0, "Emerson", "Cachorro"))
//
//        val buscaTodos = dao.buscaTodos()

        listView.setAdapter(ListaAdapter(buscaTodos, this))

    }
}

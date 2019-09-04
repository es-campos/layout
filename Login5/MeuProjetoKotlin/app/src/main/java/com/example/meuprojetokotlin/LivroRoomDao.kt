package com.example.meuprojetokotlin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao

interface LivroRoomDao {

    @Insert
    fun inserir(livros: Livros)

    @Query("SELECT * FROM livros")
    fun buscaTodos(): List<Livros>
}
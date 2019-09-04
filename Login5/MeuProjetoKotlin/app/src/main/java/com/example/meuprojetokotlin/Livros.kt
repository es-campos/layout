package com.example.meuprojetokotlin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

class Livros (@PrimaryKey (autoGenerate = true) val id: Int =0,
              @ColumnInfo (name = "nome_campo")val nome : String,
              @ColumnInfo (name = "genero_campo")val genero : String) {
}
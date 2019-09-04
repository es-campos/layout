package com.example.meuprojetokotlin

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Livros::class),version = 1, exportSchema = false)

abstract class DataBaseLivro : RoomDatabase(){
    abstract fun getDao() : LivroRoomDao
}
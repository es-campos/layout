package com.example.appio;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Carro.class}, version = 1, exportSchema = false)
public abstract class CarroDataBase extends RoomDatabase {

    public abstract RoomDAO getRoomDAO();

}

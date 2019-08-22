package com.example.appio;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface RoomDAO {

    @Insert
    void salvar(String...nome);
}

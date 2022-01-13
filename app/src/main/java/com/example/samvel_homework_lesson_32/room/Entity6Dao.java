package com.example.samvel_homework_lesson_32.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface Entity6Dao {
    @Query("SELECT * FROM entity_6")
    List<Entity6> getEntities6();

    @Transaction
    @Query("SELECT * FROM entity_6")
    List<Entity6WithEntity5> getEntity6WithEntity5Entities();

    @Insert
    void insertEntity6(Entity6 entity6);
}

package com.example.samvel_homework_lesson_32.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface Entity5Dao {
    @Query("SELECT * FROM entity_5")
    List<Entity5> getEntities5();

    @Transaction
    @Query("SELECT * FROM entity_5")
    List<Entity5WithEntity6> getEntity5WithEntity6Entities();

    @Insert
    void insertEntity5(Entity5 entity5);
}

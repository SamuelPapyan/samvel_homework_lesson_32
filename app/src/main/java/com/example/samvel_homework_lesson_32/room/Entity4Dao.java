package com.example.samvel_homework_lesson_32.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Entity4Dao {
    @Query("SELECT * FROM entity_4")
    List<Entity4> getEntities4();
    @Insert
    void insertEntity4(Entity4 entity4);
}

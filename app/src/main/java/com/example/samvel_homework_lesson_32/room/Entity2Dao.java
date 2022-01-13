package com.example.samvel_homework_lesson_32.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Entity2Dao {
    @Query("SELECT * FROM entity_2")
    List<Entity2> getEntities2();
    @Insert
    void insertEntity2(Entity2 entity2);
}

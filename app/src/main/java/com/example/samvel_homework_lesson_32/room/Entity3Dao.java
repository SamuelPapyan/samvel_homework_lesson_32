package com.example.samvel_homework_lesson_32.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface Entity3Dao {
    @Query("SELECT * FROM entity_3")
    List<Entity3> getEntities3();

    @Transaction
    @Query("SELECT * FROM entity_3")
    List<RelationshipOneToMany> getRelationshipOneToManyEntities();

    @Insert
    void insertEntity3(Entity3 entity3);
}

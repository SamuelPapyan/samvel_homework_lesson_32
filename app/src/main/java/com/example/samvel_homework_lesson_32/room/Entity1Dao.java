package com.example.samvel_homework_lesson_32.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface Entity1Dao {
    @Query("SELECT * FROM entity_1")
    List<Entity1> getEntities1();

    @Transaction
    @Query("SELECT * FROM entity_1")
    List<RelationshipOneToOne> getRelationshipOneToOneEntities();

    @Insert
    void insertEntity1(Entity1 entity1);
}

package com.example.samvel_homework_lesson_32.room;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class Entity5WithEntity6 {
    @Embedded
    public Entity5 entity5;
    @Relation(
            parentColumn = "entity5Id",
            entityColumn = "entity6Id",
            associateBy = @Junction(Entity5Entity6CrossRef.class)
    )
    public List<Entity6> entities6;
}

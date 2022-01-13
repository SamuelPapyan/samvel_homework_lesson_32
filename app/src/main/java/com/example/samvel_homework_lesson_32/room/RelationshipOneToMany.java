package com.example.samvel_homework_lesson_32.room;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class RelationshipOneToMany {
    @Embedded public Entity3 entity3;
    @Relation(
            parentColumn = "entity3Id",
            entityColumn = "entity4Id"
    )
    public List<Entity4> entities4;
}

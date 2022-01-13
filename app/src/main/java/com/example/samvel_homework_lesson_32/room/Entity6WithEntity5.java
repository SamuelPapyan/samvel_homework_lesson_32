package com.example.samvel_homework_lesson_32.room;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class Entity6WithEntity5 {
    @Embedded
    public Entity6 entity6;
    @Relation(
            parentColumn = "entityId6",
            entityColumn = "entityId5",
            associateBy = @Junction(Entity5Entity6CrossRef.class)
    )
    public List<Entity5> entities5;
}

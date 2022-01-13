package com.example.samvel_homework_lesson_32.room;

import androidx.room.Embedded;
import androidx.room.Relation;

public class RelationshipOneToOne {
    @Embedded public Entity1 entity1;
    @Relation(
            parentColumn = "entity1Id",
            entityColumn = "entity2Id"
    )
    public Entity2 entity2;
}

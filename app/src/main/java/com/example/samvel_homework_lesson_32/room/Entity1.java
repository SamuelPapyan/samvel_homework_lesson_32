package com.example.samvel_homework_lesson_32.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "entity_1")
public class Entity1 {
    @PrimaryKey(autoGenerate = true)
    int entity1Id = 0;
    @ColumnInfo(name = "entity1_col1")
    String entity1Col1;
    @ColumnInfo(name = "entity1_col2")
    String entity1Col2;
    @ColumnInfo(name = "entity1_col3")
    String entity1Col3;

    public int getEntity1Id() {
        return entity1Id;
    }

    public String getEntity1Col1() {
        return entity1Col1;
    }

    public String getEntity1Col2() {
        return entity1Col2;
    }

    public String getEntity1Col3() {
        return entity1Col3;
    }

    public void setEntity1Col1(String entity1Col1) {
        this.entity1Col1 = entity1Col1;
    }

    public void setEntity1Col2(String entity1Col2) {
        this.entity1Col2 = entity1Col2;
    }

    public void setEntity1Col3(String entity1Col3) {
        this.entity1Col3 = entity1Col3;
    }
}

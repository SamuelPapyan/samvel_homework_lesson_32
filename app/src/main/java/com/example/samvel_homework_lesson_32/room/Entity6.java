package com.example.samvel_homework_lesson_32.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "entity_6")
public class Entity6 {
    @PrimaryKey(autoGenerate = true)
    int entity6Id = 0;
    @ColumnInfo(name = "entity6_col1")
    String entity6Col1;
    @ColumnInfo(name = "entity6_col2")
    String entity6Col2;
    @ColumnInfo(name = "entity6_col3")
    String entity6Col3;

    public int getEntity6Id() {
        return entity6Id;
    }

    public String getEntity6Col1() {
        return entity6Col1;
    }

    public String getEntity6Col2() {
        return entity6Col2;
    }

    public String getEntity6Col3() {
        return entity6Col3;
    }

    public void setEntity6Col1(String entity6Col1) {
        this.entity6Col1 = entity6Col1;
    }

    public void setEntity6Col2(String entity6Col2) {
        this.entity6Col2 = entity6Col2;
    }

    public void setEntity6Col3(String entity6Col3) {
        this.entity6Col3 = entity6Col3;
    }
}

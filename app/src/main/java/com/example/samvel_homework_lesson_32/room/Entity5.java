package com.example.samvel_homework_lesson_32.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "entity_5")
public class Entity5 {
    @PrimaryKey(autoGenerate = true)
    int entity5Id = 0;
    @ColumnInfo(name = "entity5_col1")
    String entity5Col1;
    @ColumnInfo(name = "entity5_col2")
    String entity5Col2;
    @ColumnInfo(name = "entity5_col3")
    String entity5Col3;

    public int getEntity5Id() {
        return entity5Id;
    }

    public String getEntity5Col1() {
        return entity5Col1;
    }

    public String getEntity5Col2() {
        return entity5Col2;
    }

    public String getEntity5Col3() {
        return entity5Col3;
    }

    public void setEntity5Col1(String entity5Col1) {
        this.entity5Col1 = entity5Col1;
    }

    public void setEntity5Col2(String entity5Col2) {
        this.entity5Col2 = entity5Col2;
    }

    public void setEntity5Col3(String entity5Col3) {
        this.entity5Col3 = entity5Col3;
    }
}

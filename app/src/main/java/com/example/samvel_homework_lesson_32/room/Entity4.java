package com.example.samvel_homework_lesson_32.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "entity_4")
public class Entity4 {
    @PrimaryKey(autoGenerate = true)
    int entity4Id = 0;
    @ColumnInfo(name = "entity4_col1")
    String entity4Col1;
    @ColumnInfo(name = "entity4_col2")
    String entity4Col2;
    @ColumnInfo(name = "entity4_col3")
    String entity4Col3;

    public int getEntity4Id() {
        return entity4Id;
    }

    public String getEntity4Col1() {
        return entity4Col1;
    }

    public String getEntity4Col2() {
        return entity4Col2;
    }

    public String getEntity4Col3() {
        return entity4Col3;
    }

    public void setEntity4Col1(String entity4Col1) {
        this.entity4Col1 = entity4Col1;
    }

    public void setEntity4Col2(String entity4Col2) {
        this.entity4Col2 = entity4Col2;
    }

    public void setEntity4Col3(String entity4Col3) {
        this.entity4Col3 = entity4Col3;
    }
}

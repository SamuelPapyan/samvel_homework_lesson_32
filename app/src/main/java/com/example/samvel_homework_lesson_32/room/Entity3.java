package com.example.samvel_homework_lesson_32.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "entity_3")
public class Entity3 {
    @PrimaryKey(autoGenerate = true)
    int entity3Id = 0;
    @ColumnInfo(name="entity3_col1")
    String entity3Col1;
    @ColumnInfo(name="entity3_col2")
    String entity3Col2;
    @ColumnInfo(name="entity3_col3")
    String entity3Col3;

    public int getEntity3Id() {
        return entity3Id;
    }

    public String getEntity3Col1() {
        return entity3Col1;
    }

    public String getEntity3Col2() {
        return entity3Col2;
    }

    public String getEntity3Col3() {
        return entity3Col3;
    }

    public void setEntity3Col1(String entity3Col1) {
        this.entity3Col1 = entity3Col1;
    }

    public void setEntity3Col2(String entity3Col2) {
        this.entity3Col2 = entity3Col2;
    }

    public void setEntity3Col3(String entity3Col3) {
        this.entity3Col3 = entity3Col3;
    }
}

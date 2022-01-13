package com.example.samvel_homework_lesson_32.room;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "entity_2")
public class Entity2 {
    @PrimaryKey(autoGenerate = true)
    int entity2Id = 0;
    @ColumnInfo(name="entity2_col1")
    String entity2Col1;
    @ColumnInfo(name="entity2_col2")
    String entity2Col2;
    @ColumnInfo(name="entity2_col3")
    String entity2Col3;

    public int getEntity2Id() {
        return entity2Id;
    }

    public String getEntity2Col1() {
        return entity2Col1;
    }

    public String getEntity2Col2() {
        return entity2Col2;
    }

    public String getEntity2Col3() {
        return entity2Col3;
    }

    public void setEntity2Col1(String entity2Col1) {
        this.entity2Col1 = entity2Col1;
    }

    public void setEntity2Col2(String entity2Col2) {
        this.entity2Col2 = entity2Col2;
    }

    public void setEntity2Col3(String entity2Col3) {
        this.entity2Col3 = entity2Col3;
    }
}

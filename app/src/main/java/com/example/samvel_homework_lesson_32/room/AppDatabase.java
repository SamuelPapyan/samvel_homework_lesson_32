package com.example.samvel_homework_lesson_32.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(
        entities={
                Entity1.class,
                Entity2.class,
                Entity3.class,
                Entity4.class,
                Entity5.class,
                Entity6.class,
                Entity5Entity6CrossRef.class
        },
        version = 2
)
public abstract class AppDatabase extends RoomDatabase{
    private static final String DB_Name = "lesson_36_db";
    private static volatile AppDatabase INSTANCE;

    public abstract Entity1Dao getEntity1Dao();
    public abstract Entity2Dao getEntity2Dao();
    public abstract Entity3Dao getEntity3Dao();
    public abstract Entity4Dao getEntity4Dao();
    public abstract Entity5Dao getEntity5Dao();
    public abstract Entity6Dao getEntity6Dao();

    public static synchronized AppDatabase getInstance(Context context){
        if(INSTANCE == null){
            Builder<AppDatabase> appDatabaseBuilder = Room.databaseBuilder(
                    context,
                    AppDatabase.class,
                    DB_Name
            );
            INSTANCE = appDatabaseBuilder
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
}

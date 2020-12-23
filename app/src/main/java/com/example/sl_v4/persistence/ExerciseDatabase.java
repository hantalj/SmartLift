package com.example.sl_v4.persistence;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.sl_v4.models.Exercise;

@Database(entities = {Exercise.class}, version = 1)
public abstract class ExerciseDatabase extends RoomDatabase {

    public static final String DATABASE_NAME = "exercises_db";

    private static ExerciseDatabase instance;

    static ExerciseDatabase getInstance(final Context context){
        if(instance == null){
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    ExerciseDatabase.class,
                    DATABASE_NAME
            ).build();
        }
        return instance;
    }

    public abstract ExerciseDao getExerciseDao();
}

package com.example.sl_v4.persistence;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.sl_v4.async.InsertAsyncTask;
import com.example.sl_v4.models.Exercise;

import java.util.List;

public class ExerciseRepository {

    private ExerciseDatabase mExerciseDatabase;

    public ExerciseRepository(Context context) {
        mExerciseDatabase = ExerciseDatabase.getInstance(context);
    }

    public void insertExerciseTask (Exercise exercise){
        new InsertAsyncTask(mExerciseDatabase.getExerciseDao()).execute(exercise);
    }

    public void updateExercise(Exercise exercise){

    }

    public LiveData<List<Exercise>> retrieveExerciseTask(){
        return mExerciseDatabase.getExerciseDao().getExercises();
    }

    public void deleteExercise(Exercise exercise){

    }
}

package com.example.sl_v4.async;

import android.os.AsyncTask;

import com.example.sl_v4.models.Exercise;
import com.example.sl_v4.persistence.ExerciseDao;

public class InsertAsyncTask extends AsyncTask<Exercise, Void, Void> {

    private ExerciseDao mExerciseDao;

    public InsertAsyncTask(ExerciseDao dao) {
        mExerciseDao = dao;
    }

    @Override
    protected Void doInBackground(Exercise... exercises) {
        mExerciseDao.insertExercises(exercises);
        return null;
    }
}

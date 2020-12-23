package com.example.sl_v4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sl_v4.models.Exercise;
import com.example.sl_v4.persistence.ExerciseRepository;

public class AddNewExercise extends AppCompatActivity {

    //vars
    private ExerciseRepository mExerciseRepository;
    private EditText mNewExerciseName, mNewExerciseWeight, mNewExerciseRep, mNewExerciseRpe, mNewExerciseDate;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_exercise);
        mNewExerciseName = findViewById(R.id.new_exercise_name);
        mNewExerciseWeight = findViewById(R.id.new_exercise_weight);
        mNewExerciseRep = findViewById(R.id.new_exercise_rep);
        mNewExerciseRpe = findViewById(R.id.new_exercise_rpe);
        mNewExerciseDate = findViewById(R.id.new_exercise_date);
        final Button button = findViewById(R.id.button_save);

        mExerciseRepository = new ExerciseRepository(this);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String name = mNewExerciseName.getText().toString();
                float weight = Float.parseFloat(mNewExerciseWeight.getText().toString());
                int rep = Integer.parseInt(mNewExerciseRep.getText().toString());
                float rpe = Float.parseFloat(mNewExerciseRpe.getText().toString());
                String date = mNewExerciseDate.getText().toString();
                Exercise exercise1 = new Exercise(name, weight, rep, rpe, date);
                saveNewExercise(exercise1);
                finish();
            }
        });
    }

    private void saveNewExercise(Exercise exercise){
        mExerciseRepository.insertExerciseTask(exercise);
    }

}
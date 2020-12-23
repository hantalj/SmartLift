package com.example.sl_v4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.sl_v4.models.Exercise;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final int NEW_WORD_ACTIVITY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonWorkoutLog = findViewById(R.id.button);
        Button buttonBrowseWorkout = findViewById(R.id.button2);
        Button buttonRpeCalculator = findViewById(R.id.button3);
        Button buttonChart = findViewById(R.id.button4);
        Button buttonWorkoutPlanner = findViewById(R.id.button5);
        Button buttonSettings = findViewById(R.id.button6);



        buttonWorkoutLog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.workout_log);
                Intent intent = new Intent(MainActivity.this, WorkoutLog.class);
                startActivityForResult(intent, NEW_WORD_ACTIVITY_REQUEST_CODE);
            }
        });
        buttonBrowseWorkout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.browse_workout);
            }
        });
        buttonRpeCalculator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.rpe_calculator);
            }
        });
        buttonChart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_graph);
            }
        });

        buttonWorkoutPlanner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.workout_planner);
            }
        });
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.settings);
            }
        });




    }
}
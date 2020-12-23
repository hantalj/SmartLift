package com.example.sl_v4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sl_v4.adapters.ExerciseRecyclerAdapter;
import com.example.sl_v4.models.CalendarSL;
import com.example.sl_v4.models.Exercise;
import com.example.sl_v4.persistence.ExerciseRepository;
import com.example.sl_v4.util.VerticalSpacingItemDecorator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class WorkoutLog extends AppCompatActivity {

    // UI components
    private RecyclerView mRecyclerView;

    // vars
    private ArrayList<Exercise> mExercises = new ArrayList<>();
    private ExerciseRecyclerAdapter mExerciseRecyclerAdapter;
    private ExerciseRepository mExerciseRepository;


    public static final int NEW_WORD_ACTIVITY_REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_log);
        mRecyclerView = findViewById(R.id.recyclerView);

        mExerciseRepository = new ExerciseRepository(this);
        initRecyclerView();
        retrieveExercises();
        setSupportActionBar((Toolbar)findViewById(R.id.workout_log_toolbar));
        setTitle("Workout log");
        //insertTestExercisesWithDate();
        //insertTestExercisesWithoutDate();


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkoutLog.this, AddNewExercise.class);
                startActivityForResult(intent, NEW_WORD_ACTIVITY_REQUEST_CODE);
            }
        });

    }

    private void retrieveExercises(){
        mExerciseRepository.retrieveExerciseTask().observe(this, new Observer<List<Exercise>>() {
            @Override
            public void onChanged(List<Exercise> exercises) {
                if (mExercises.size()>0) {
                    mExercises.clear();
                }
                if (mExercises != null){
                    mExercises.addAll(exercises);
                }
                mExerciseRecyclerAdapter.notifyDataSetChanged();

            }
        });
    }


    private void insertTestExercisesWithoutDate(){
        CalendarSL today = new CalendarSL();
        Exercise exercise1 = new Exercise("squat", 140, 1, 8, today.toString());
        mExercises.add(exercise1);

        mExerciseRecyclerAdapter.notifyDataSetChanged();
    }

    private void insertTestExercisesWithDate(){
        CalendarSL today = new CalendarSL();
        Exercise exercise1 = new Exercise("squat", 140, 1, 8, today.toString());
        mExercises.add(exercise1);
        mExercises.add(exercise1);
        mExercises.add(exercise1);
        Exercise exercise2 = new Exercise("squat", 125, 5, 9, today.toString());
        mExercises.add(exercise2);
        Exercise exercise3 = new Exercise("squat", (float) 112.5, 5, 7, today.toString());
        mExercises.add(exercise3);
        Exercise exercise4 = new Exercise("squat", (float) 112.5, 5, 8, today.toString());
        mExercises.add(exercise4);
        Exercise exercise5 = new Exercise("squat", (float) 112.5, 5, (float) 8.5, today.toString());
        mExercises.add(exercise5);
        Exercise exercise6 = new Exercise("benchpress", 100, 1, (float) 8.5, today.toString());
        mExercises.add(exercise6);
        mExercises.add(exercise6);
        mExercises.add(exercise6);
        Exercise exercise7 = new Exercise("benchpress", 90, 4, 9, today.toString());
        mExercises.add(exercise7);
        Exercise exercise8 = new Exercise("benchpress", 80, 4, (float) 6.5, today.toString());
        mExercises.add(exercise8);
        Exercise exercise9 = new Exercise("benchpress", 80, 4, (float) 6.5, today.toString());
        mExercises.add(exercise9);
        Exercise exercise10 = new Exercise("benchpress", 80, 4, 7, today.toString());
        mExercises.add(exercise10);
        Exercise exercise11 = new Exercise("benchpress", 80, 4, 8, today.toString());
        mExercises.add(exercise11);
        Exercise exercise12 = new Exercise("deadlift", 185, 1, (float) 8.5, today.toString());
        mExercises.add(exercise12);
        mExercises.add(exercise12);
        mExercises.add(exercise12);
        Exercise exercise13 = new Exercise("deadlift", (float) 162.5, 5, (float) 8.5, today.toString());
        mExercises.add(exercise13);
        Exercise exercise14 = new Exercise("deadlift", (float) 152.5, 5, (float) 7.5, today.toString());
        mExercises.add(exercise14);
        Exercise exercise15 = new Exercise("deadlift", (float) 152.5, 1, (float) 7.5, today.toString());
        mExercises.add(exercise15);
        Exercise exercise16 = new Exercise("deadlift", (float) 152.5, 1, 8, today.toString());
        mExercises.add(exercise16);
        Exercise exercise17 = new Exercise("press", (float) 67.5, 1, 8, today.toString());
        mExercises.add(exercise17);
        mExercises.add(exercise17);
        mExercises.add(exercise17);
        Exercise exercise18 = new Exercise("press", (float) 60, 4, (float) 8.5, today.toString());
        mExercises.add(exercise18);
        Exercise exercise19 = new Exercise("press", (float) 52.5, 4, 7, today.toString());
        mExercises.add(exercise19);
        Exercise exercise20 = new Exercise("press", (float) 52.5, 4, 7, today.toString());
        mExercises.add(exercise20);
        Exercise exercise21 = new Exercise("press", (float) 52.5, 4, 8, today.toString());
        mExercises.add(exercise21);
        Exercise exercise22 = new Exercise("press", (float) 52.5, 4, 8, today.toString());
        mExercises.add(exercise22);
        mExercises.add(exercise22);



        mExerciseRecyclerAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        VerticalSpacingItemDecorator itemDecorator = new VerticalSpacingItemDecorator(10);
        mRecyclerView.addItemDecoration(itemDecorator);
        mExerciseRecyclerAdapter = new ExerciseRecyclerAdapter(mExercises);
        mRecyclerView.setAdapter(mExerciseRecyclerAdapter);

    }
}

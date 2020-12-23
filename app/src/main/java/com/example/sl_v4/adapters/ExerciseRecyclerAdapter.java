package com.example.sl_v4.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sl_v4.R;
import com.example.sl_v4.models.Exercise;

import java.util.ArrayList;

public class ExerciseRecyclerAdapter extends RecyclerView.Adapter<ExerciseRecyclerAdapter.ViewHolder> {

    private ArrayList<Exercise> mExercise = new ArrayList<>();

    public ExerciseRecyclerAdapter(ArrayList<Exercise> exercise) {
        this.mExercise = exercise;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_exercise_list_item, viewGroup, false );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.name.setText(mExercise.get(position).getName());
        viewHolder.weight.setText(String.valueOf(mExercise.get(position).getWeight()));
        viewHolder.rep.setText(String.valueOf(mExercise.get(position).getRep()));
        viewHolder.rpe.setText(String.valueOf(mExercise.get(position).getRpe()));
        viewHolder.date.setText(mExercise.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return mExercise.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name, weight, rep, rpe, date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.exercise_name);
            weight = itemView.findViewById(R.id.exercise_weight);
            rep = itemView.findViewById(R.id.exercise_rep);
            rpe = itemView.findViewById(R.id.exercise_rpe);
            date = itemView.findViewById(R.id.exercise_date);
        }
    }

}

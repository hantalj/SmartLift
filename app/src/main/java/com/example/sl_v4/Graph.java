package com.example.sl_v4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Graph extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        final GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.setVisibility(View.VISIBLE);
        LineGraphSeries <DataPoint> series = new LineGraphSeries< >(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(0, 100),
                new DataPoint(1, 105),
                new DataPoint(2, 107),
                new DataPoint(3, 110),
                new DataPoint(4, 110),
                new DataPoint(5, 107),
                new DataPoint(6, 115)
        });
        graph.setBackgroundColor(Color.WHITE);
        series.setColor(Color.BLUE);
        graph.addSeries(series);

    }
}
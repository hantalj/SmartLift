package com.example.sl_v4.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Calendar;
import java.util.Date;
@Entity(tableName = "exercises")
public class Exercise {


    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "weight")
    private float weight;
    @ColumnInfo(name = "rep")
    private int rep;
    @ColumnInfo(name = "rpe")
    private float rpe;
    @ColumnInfo(name = "date")
    private String date;

    public Exercise(String name, float weight, int rep, float rpe, String date) {
        this.name = name;
        this.weight = weight;
        this.rep = rep;
        this.rpe = rpe;
        this.date = date;
    }
    @Ignore
    public Exercise(String name, float weight, int rep, float rpe) {
        this.name = name;
        this.weight = weight;
        this.rep = rep;
        this.rpe = rpe;

    }
    @Ignore
    public Exercise(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getRep() {
        return rep;
    }

    public void setRep(int rep) {
        this.rep = rep;
    }

    public float getRpe() {
        return rpe;
    }

    public void setRpe(float rpe) {
        this.rpe = rpe;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "exercise{" +
                "id=" + id +
                ", name=" + name +
                ", weight=" + weight +
                ", rep=" + rep +
                ", rpe=" + rpe +
                ", date=" + date +
                '}';
    }
}

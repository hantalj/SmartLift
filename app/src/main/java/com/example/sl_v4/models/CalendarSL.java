package com.example.sl_v4.models;

import java.util.Calendar;

public class CalendarSL {
    private int year, month, day;

    public CalendarSL() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR); // get the current year
        int month = calendar.get(Calendar.MONTH); // month...
        int day = calendar.get(Calendar.DAY_OF_MONTH); // current day in the month
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "" + day + "/" + month + "/" + year +"";
    }
}


package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

    public class Duration
    {
    private int hour, minute, second;

    //get and setter hour , min , second
    public int getHour()
    {
        return hour;
    }
    public void setHour(int newHour)
    {
        this.hour = newHour;
    }
    public int getMin()
    {
        return minute;
    }
    public void setMin(int newMin)
    {
        this.minute = newMin;
    }
    public int getSecond()
    {
        return second;
    }
    public void setSecond(int newSecond)
    {
        this.second = newSecond;
    }
    public Duration(int hour, int min, int second)
    {
        this.hour = hour;
        this.minute = min;
        this.second = second;
    }
    //default duration
    public Duration()
    {
        this.hour = 1;
        this.minute = 15;
        this.second = 15;
    }
    @Override
    public String toString()
    {
        return String.format("%01d:%02d:%02d", hour, minute, second);
    }

    public void Durationsorter() throws IOException
    {
        BufferedReader c = new BufferedReader(new FileReader("albums.txt"));

        String line;

        ArrayList<String> tracktime;
        tracktime = new ArrayList<>();

        ArrayList<String> trackname;
        trackname = new ArrayList<>();

    while ((line = c.readLine()) != null)
    {
        if (line.startsWith(String.valueOf(0)))
    {
            String[] file = line.split("-");
            //System.out.println(Arrays.toString(file));

            tracktime.add(file[0]);
            //System.out.println(tracktime);

            trackname.add(file[1]);
            // System.out.println(trackname);

                for (int i = 0; i < file.length; i++) ;

    }

    }

    }
    }

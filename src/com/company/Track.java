package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


    public class Track
    {
    int hour, min, sec;
    String trackName;

    public Track(int hours, int minute, int second, String name)
    {
        hour = hours;
        min = minute;
        sec = second;
        trackName = name;
    }
    //default track
    public Track(){
        hour = 0;
        min = 0;
        sec = 0;
        trackName = "Name";
    }

    public String toString()
    {
        return String.format("%2d:%2d:%2d %s", hour, min, sec, trackName);
    }

    public ArrayList<String> Tracksorter() throws IOException
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

                tracktime.add(file[0]);

                trackname.add(file[1]);

                    for (int i = 0; i < file.length; i++) ;
    }
    }
    return tracktime;
    }


}

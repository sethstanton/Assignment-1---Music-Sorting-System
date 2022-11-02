package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

    public class Album
    {
        int releaseYear;
        String artist;
        String title;

    public Album(String Artist, String Title, int releaseyear)
    {
        artist = Artist;
        title = Title;
        releaseYear = releaseyear;
    }

    //default album

    public Album()
    {
        artist = "person";
        title = "title";
        releaseYear = 0;
    }
    //format for year sorting
    public String toString() {
        return String.format("%s %s  %04d", artist, title, releaseYear);
    }


    public void Albumsorter () throws IOException {
        BufferedReader c = new BufferedReader(new FileReader("albums.txt"));

        String line;

        ArrayList<String> albumtitle;
        albumtitle = new ArrayList<>();

        ArrayList<String> albumArtist;
        albumArtist = new ArrayList<>();

    while ((line = c.readLine()) != null) {
        if (line.startsWith(String.valueOf(0))) {
        String[] file = line.split("-");
        for (int i = 0; i < file.length; i++) ;

    }
    else
    {
//splitting the album name and band name, removed brackets
        String[] alb = line.split(":");
        String albumname = alb[1];
        albumname = albumname.replaceAll("[()]", "");
        String albumartist = alb [0];

        albumtitle.add(alb[1]);

        albumArtist.add(alb[0]);
            for (int j = 0; j < alb.length; j++) ;
    }
    }
    //Finding the longest string

    int largestString = albumtitle.get(0).length();
    int index = 0;
        for( int i = 0; i < albumtitle.size(); i++)
    {
            if(albumtitle.get(i).length() > largestString)
    {
            largestString = albumtitle.get(i).length();
            index = i;
    }
    }
    System.out.println(" Task 4");
    System.out.println(albumtitle.get(index) + " " + "is the longest Album title");
    }
}

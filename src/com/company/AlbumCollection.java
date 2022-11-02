package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


    public class AlbumCollection
    {
//Sorting albums.txt into arraylists to be used for sorting.

    public void SortingReader () throws IOException
    {
    BufferedReader c = new BufferedReader(new FileReader("albums.txt"));
    String line;

    ArrayList<String> tracktime;
    tracktime = new ArrayList<String>();

    ArrayList<String> trackname;
    trackname = new ArrayList<>();

    ArrayList<String> albumtitle;
    albumtitle = new ArrayList<>();

    ArrayList<String> albumArtist;
    albumArtist = new ArrayList<>();

    while((line = c.readLine()) != null)
    {
        if (line.startsWith(String.valueOf(0))){
        String[] file = line.split("-");

        tracktime.add(file[0]);

        trackname.add(file[1]);

        for (int i = 0; i < file.length; i++);

    }
        else
    {
    //splitting the album name and band name, removed brackets
    String[] album = line.split(":");
    String albumname = album [1];
    albumname = albumname.replaceAll("[()]","");
    String albumartist = album [0];

    albumtitle.add(album[1]);

    albumArtist.add(album[0]);

        for (int j = 0; j < album.length; j++);
    }
    }

    }
    }
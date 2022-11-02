package com.company;

import java.io.IOException;
import java.util.*;


    public class AlbumDatabase
    {

    public static void main(String[] args) throws IOException
    {

    //test harness duration
    /*  Duration x = new Duration();
    Duration f =new Duration(1,2,52);
    String str = f.toString();
    System.out.println(str);
    System.out.println(x);*/

    //test harness for track
    /*Track test = new Track(0,2,45,"five" );
    System.out.println(test.hour+ " " + test.min + " " + test.sec + " " + test.trackName);
    Track a = new Track(1,10,52, "test" );
    String tr = a.toString();
    System.out.println(tr);*/

    //test harness for album
    /* Album b = new Album("Name","Name",1999);
    String ab = b.toString();
    System.out.println(ab);*/

    //Commands that allows me to read the classes into the main class
    AlbumCollection read = new AlbumCollection();
    read.SortingReader();

    Track re = new Track();
    re.Tracksorter();

    Album rea = new Album();
    rea.Albumsorter();

    Duration r = new Duration();
    r.Durationsorter();

    //This code allows me to sort the shortest track duration
    ArrayList<String> ST;
    Track lip = new Track();
    ST = lip.Tracksorter();

    Collections.sort(ST);
    System.out.println(" Task 5");
    System.out.println(" The shortest track is Hello Vegetables by Neil Pye" + " " +ST.get(0));





        }
    }


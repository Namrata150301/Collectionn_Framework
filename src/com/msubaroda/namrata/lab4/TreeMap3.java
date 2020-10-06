package com.msubaroda.namrata.lab4;
//java version 14.0.2;
import java.util.*;

public class TreeMap3 {
    public static void main(String []args){
        //Creating Empty TreeMap
        TreeMap<String,String> t=new TreeMap<>();
        t.put("b1","Red");
        t.put("b2","White");
        t.put("b3","Black");
        t.put("b4","Violet");
        System.out.println("Original TreeMap"+t);

        //Greatest value using firstEntry()
        System.out.println("Greatest value "+t.firstEntry());

        //least value using lastEntry()
        System.out.println("Least value "+t.lastEntry());
        //lowest key
        System.out.println("Lowest key "+t.lastKey());
        //Highest key
        System.out.println("Highest key "+t.firstKey());

        //TreeMap in the reverse order
        System.out.println("Original Map"+t);
        System.out.println("Reverse order Map"+t.descendingKeySet());

    }
}

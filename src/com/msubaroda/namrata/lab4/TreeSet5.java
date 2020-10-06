package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class TreeSet5 {
    public static void main(String []args){
        //Creating empty TreeSet
        TreeSet<String> t=new TreeSet<>();
        //Adding elements in TreeSet
        t.add("Red");
        t.add("White");
        t.add("Black");
        t.add("Pink");
        t.add("Orange");
        //Retrieving first element from set after removing
        System.out.println("Orininal Set:"+t);
        System.out.println("Removed first element:"+t.pollFirst());
        //Retrieving last element from set after removing
        System.out.println("Removed last element:"+t.pollLast());
        System.out.println("After removing elements the Set is:"+t);
    }
}

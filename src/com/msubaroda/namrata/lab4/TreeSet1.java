package com.msubaroda.namrata.lab4;
//java version 14.0.2
//TreeSet
import java.util.*;

public class TreeSet1 {
    public static void main(String []args){
        //Creating Empty TreeSet
        TreeSet<String> t=new TreeSet<>();
        //Adding colors to treeset
        t.add("Red");
        t.add("White");
        t.add("Black");
        t.add("Purple");
        t.add("Orange");
        t.add("Yellow");

        //Getting First element from TreeSet
        System.out.println("The first element of Set is");
        System.out.println(t.first());

        //Getting Last element from TreeSet
        System.out.println("The last element of Set is");
        System.out.println(t.last());

        //Printing the colors in the TreeSet
        //iterate over TreeSet
        for(String e:t){
            System.out.println(e);
        }
        //Printing the TreeSet in reverse order
        //t.descendingSet();
        System.out.println("Printing the TreeSet in reverse order");
        System.out.println(t.descendingSet());

        //Getting the number of elements in TreeSet
        System.out.println("No. of elements in the Set is");
        System.out.println(t.size());

    }
}

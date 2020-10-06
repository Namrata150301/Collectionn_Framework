package com.msubaroda.namrata.lab4;
//Java version 14.0.2
import java.util.*;

public class TreeSet4 {
    public static void main(String [] args){
        //Creating empty TreeSet
        TreeSet<Integer> n=new TreeSet<>();
        TreeSet<Integer> treeheadset=new TreeSet<>();
        //Adding elements to set
        n.add(1);
        n.add(2);
        n.add(26);
        n.add(10);
        n.add(22);
        n.add(34);

        //Removing elements from Treeset
        System.out.println("The Original set:"+n);
        System.out.println("The removed element is:"+n.remove(22));
        System.out.println("After removing one element "+n);

        //Displaying numbers that are strictly greater than 2
        System.out.println("Strictly Greater than 2:"+n.higher(2));
        //Displaying numbers that are strictly lesser than 10
        System.out.println("Strictly lesser than 34:"+n.lower(34));

    }
}

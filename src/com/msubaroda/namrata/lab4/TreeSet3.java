package com.msubaroda.namrata.lab4;
//java version 14.0.2;
import java.util.*;

public class TreeSet3 {
    public static void main(String []args) {
        //Creating TreeSet
        TreeSet<Integer> c = new TreeSet<Integer>();
        TreeSet<Integer> treeheadset = new TreeSet<Integer>();
        c.add(12);
        c.add(15);
        c.add(13);
        c.add(11);
        c.add(45);
        //Displaying the number that are greater than equal to
        //by using ceiling method
        System.out.println("Greater than or equal to 11: "+c.ceiling(10));
        //Displaying the number that are lesser than equal to
        //by using floor method
        System.out.println("Lesser than or equal to "+c.floor(40));



    }

}

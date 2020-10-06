package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;
import java.util.HashSet;

public class Hashset2 {
    public static void main(String [] args){
        //Creating empty HashSet
        HashSet<String> h1=new HashSet<String>();
        //adding elements to Hashset
        h1.add("Red");
        h1.add("White");
        h1.add("Orange");
        //Creating clone hashset
        System.out.println("The original Hashset is "+h1);
        HashSet<String> h2=new HashSet<String>();
        h2=(HashSet)h1.clone();
        System.out.println("The clone Hashset is "+h2);

        //Converting Hashset into array
        List<String> c1=new ArrayList<String>(h1);
        //Displaying array elements
        System.out.println("The arraylist is"+h1);

    }
}

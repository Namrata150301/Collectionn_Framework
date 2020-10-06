package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class Hashset1 {
    public static void main(String []args){
        //Creating Hashset
        HashSet<String> h=new HashSet<String>();
        //Adding elements in the hashset
        h.add("Rose");
        h.add("Lotus");
        h.add("Lily");
        h.add("Daisy");

        //iterating through HashSet using for loop
        for(String e:h)
        System.out.println(e);
        //Checking whether hashset is empty or not
        System.out.println("Check  hashSet is empty or not "+h.isEmpty());

        //get the number of elements in Hashset
        System.out.println("Size of hashset is "+h.size());

        //Removing all elements from list
        h.removeAll(h);
        System.out.println(h);
    }
}

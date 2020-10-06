package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class Hashset4 {
    public static void main(String []args){
        //Creating Hashset
        HashSet<String> h=new HashSet<>();
        h.add("Rose");
        h.add("Lotus");
        h.add("Lily");
        h.add("Daisy");
        //Creating another Hashset
        HashSet<String> h1=new HashSet<>();
        h1.add("Red");
        h1.add("Lotus");
        h1.add("Mogra");
        h1.add("Daisy");
        //comparing two Hashset
        HashSet<String> h2=new HashSet<String>();
        System.out.println("Comparing two sets");
        for(String e:h){
            System.out.println(h1.contains(e) ? "Yes" : "No");
        }
        //Retrieving same elements in both sets.
        System.out.println("Hashset 1 :"+h);
        System.out.println("Hashset 2 :"+h1);
        h.retainAll(h1);
        System.out.println("Same elements in both the sets are:");
        System.out.println(h);

    }

}

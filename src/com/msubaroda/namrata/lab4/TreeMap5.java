package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class TreeMap5 {
    public static void main(String []args){
        //Creating empty Map
        TreeMap<Integer,String> a=new TreeMap<>();
        a.put(10,"Red");
        a.put(20,"White");
        a.put(30,"Green");
        a.put(40,"Black");
        System.out.println("Original TreeMap"+a);
        System.out.println("-----------------------");
        System.out.println("Checking the entry for 30");
        System.out.println("Keys: "+a.headMap(30));
        System.out.println("-----------------------");
        //using headMap() method with boolen
        System.out.println("With boolen inclusive true");
        System.out.println("Keys: "+a.headMap(40,true));
        System.out.println("With boolen inclusive false");
        System.out.println("Keys: "+a.headMap(40,false));
        //higher Entry
        System.out.println("-----------------------");
        System.out.println("Checking the entry for 30");
        System.out.println("Keys: "+a.higherEntry(30));
        System.out.println("Checking the entry for 50");
        System.out.println("Keys: "+a.higherEntry(50));
        //Lower entry
        System.out.println("-----------------------");
        System.out.println("Checking the entry for 30");
        System.out.println("Keys: "+a.lowerEntry(30));
        //Navigate through Map
        System.out.println("-----------------------");
        System.out.println("Original TreeMap content"+a.navigableKeySet());


    }
}

package com.msubaroda.namrata.lab4;
// java version 14.0.2
import java.util.*;

public class TreeMap4 {
    public static void main(String []args){
        //Creating empty Map
        TreeMap<String,String> a=new TreeMap<>();
        a.put("A1","Red");
        a.put("A2","White");
        a.put("A3","Green");
        a.put("A4","Black");
        System.out.println("Original TreeMap"+a);
        //Getting value for the key
        System.out.println("Checking entry for A1:");
        System.out.println("Value is:"+a.floorEntry("A1"));
        System.out.println("Checking entry for A3:");
        System.out.println("Value is:"+a.floorEntry("A3"));
        //Getting key
        System.out.println("Key is:"+a.floorKey("A2"));
        System.out.println("Checking the ");
    }
}

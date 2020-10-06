package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class HashMap1 {
    public static void main(String []args){
        HashMap<Integer,String> h=new HashMap<Integer,String>();
        h.put(1,"Red");
        h.put(2,"Blue");
        h.put(3,"Pink");
        h.put(4,"Black");
        for(Map.Entry x:h.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());}
            System.out.println("Size of Hash Map is "+h.size());


        //Creating another HashMap
        HashMap<Integer,String> h1=new HashMap<Integer,String>();
        h1.put(5,"Yellow");
        h1.put(6,"Violet");
        //putting all elements of second map into first map
        h1.putAll(h);
        System.out.println("Hash map is"+h1);
        //Checking a key-value in the HashMap
        System.out.println(h.containsKey(2));
        System.out.println(h.containsValue("Blue"));
        //Removing all elements from Map
        h.clear();
        System.out.println(h);
    }
}

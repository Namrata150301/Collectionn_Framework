package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;


public class TreeMap7 {
    public static void main(String []main){
        TreeMap<Integer,String> t=new TreeMap<>();
        //putting all elements in TreeMap
        t.put(1,"Red");
        t.put(2,"White");
        t.put(3,"Pink");
        t.put(4,"Blue");
        t.put(5,"Yellow");
        t.put(6,"Brown");
        //Portion of TreeMap
        System.out.println("TreeMap is:"+t);
        System.out.println("Keys greater than or equal to 2:"+t.ceilingEntry(2));
        System.out.println("Keys greater than or equal to 4:"+t.ceilingEntry(4));
        System.out.println("---------------------------------------");
        System.out.println("Keys are greater than 2"+t.tailMap(2,false));
        System.out.println("----------------------------------------");
        System.out.println("Keys greater than or equal to 2:"+t.ceilingKey(4));

    }
}

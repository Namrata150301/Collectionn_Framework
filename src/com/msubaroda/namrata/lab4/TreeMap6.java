package com.msubaroda.namrata.lab4;
import java.util.*;

public class TreeMap6 {
    public static void main(String []args){
        //Creating empty TreeMap
        TreeMap<Integer,String> t=new TreeMap<>();
        SortedMap<Integer,String> m=new TreeMap<>();
        //putting all elements in TreeMap
        t.put(1,"Red");
        t.put(2,"White");
        t.put(3,"Pink");
        t.put(4,"Blue");
        t.put(5,"Yellow");
        t.put(6,"Brown");
        //Portion of TreeMap
        System.out.println("TreeMap is:"+t);
        m=t.subMap(1,4);
        System.out.println("Sub Map is: "+m);
        System.out.println("-----------------------");
        //polling first entry
        System.out.println("Value before poll"+t);
        System.out.println("Value returned"+t.pollFirstEntry());
        System.out.println("Value returned"+t.pollLastEntry());
        System.out.println("After poll"+t);
        System.out.println("-----------------------");
        System.out.println("Keys that are greater than or equal to 2 : "+t.tailMap(2));


    }
}

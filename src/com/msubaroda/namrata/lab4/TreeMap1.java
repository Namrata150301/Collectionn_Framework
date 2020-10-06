package com.msubaroda.namrata.lab4;
//java version  14.0.2
import java.util.*;

public class TreeMap1 {
    public static void main(String []args){
        //Creating empty treemap
        TreeMap<Integer,String> t=new TreeMap<>();
        t.put(1,"Red");
        t.put(2,"Black");
        t.put(3,"White");
        t.put(4,"Violet");
        t.put(5,"Yellow");
        System.out.println(t);
        //Creating another TreeMap
        TreeMap<Integer,String> t2=new TreeMap<>();
        t2.put(6,"Orange");
        t2.put(7,"Green");
        //Copying all elements  from map1 to map2
        t.putAll(t2);
        System.out.println("After copying map2 to map1:"+t);
        //get all keys from Map
        System.out.println("Getting all keys from Map");
        Set<Integer> keys=t.keySet();
        for(Integer k:keys){
            System.out.println(k);
        }

        //searching a key in Map
        if(t.containsKey(4)){
            System.out.println("Tree Map contains 4");
        }
        else{
            System.out.println("Tree Map does not contain 4");
        }
        //searching a value in Map
        if(t.containsValue("Green")){
            System.out.println("Tree map contains color Green");
        }
        else{
            System.out.println("Tree map does not contain Green");
        }

        //deleting all elements from Map
        System.out.println("The Original TreeMap:"+t);
        t.clear();
        System.out.println("After deleting all elements from Map:"+t);

    }
}

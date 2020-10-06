package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class HashMap2 {
    public static void main(String []args){
    //Creating HashMap
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(1,"White");
    hm.put(2,"Red");
    hm.put(3,"Black");
    hm.put(4,"Blue");
    hm.put(5,"Yellow");

    //get keyset value from map
        Set keyset=hm.keySet();
        //check key set values
        System.out.println("Key set values are:"+keyset);

        //checking collection view of the map
        System.out.println("Collection view is: "+hm.values());

    //print the map
        //get value of key
        String val=(String)hm.get(2);
        //check the value
        System.out.println("value for key 2 is: "+val);

        System.out.println("The original Map :"+hm);
        System.out.println("1.Is value\'Black\' exists?");
        if(hm.containsValue("Black")){
            //value exists
            System.out.println("yes!");
        }
        else{
            System.out.println("no!");
        }
    }
}

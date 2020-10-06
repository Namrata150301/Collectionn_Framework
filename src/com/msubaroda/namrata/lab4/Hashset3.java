package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class Hashset3 {
    public static void main(String []args){
        //Creating Hashset
        HashSet<String> c=new HashSet<String>();
        //Adding elements in hashset
        c.add("Red");
        c.add("Purple");
        c.add("Black");
        c.add("White");
        //Converting HashSet into TreeSet
        //Creating TreeSet
        Set<String> s=new TreeSet<>(c);
        System.out.println("TreeSet elements are");
        for(String e:s){

            System.out.println(e);

        }
        //Converting HashSet into Array
        //Creating array
        String[]  arr=new String[c.size()];
        c.toArray(arr);
        System.out.println("Array elements are");
        for(String e:arr){

            System.out.println(e);
        }

    }
}

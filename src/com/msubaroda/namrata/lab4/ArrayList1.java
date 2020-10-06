package com.msubaroda.namrata.lab4;
import java.util.*;

//java version 14.0.2
//date 02-10-20

public class ArrayList1 {
    //swapping two element in an arraylist
    public static void main(String []args) {
        ArrayList<String> c = new ArrayList<String>();
        c.add("Rose");
        c.add("Lotus");
        c.add("Hibiscus");
        c.add("Lily");
       /* System.out.println("Array list before Swap:");
        for(String e:c){
            System.out.println(e);
        }
        //After swapping
        Collections.swap(c,0,3);
        System.out.println("Array list after Swap");
        for(String a:c){
            System.out.println(a);
        }*/
        //clone the array list into another array list
        ArrayList<String> s= (ArrayList<String>)c.clone();
        System.out.println("The cloned array is "+s);

        //to empty an array list
        System.out.println("The original list is"+s);
        c.removeAll(c);
        System.out.println("ArrayList after removing all elements is "+c);
    }


}

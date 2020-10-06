package com.msubaroda.namrata.lab4;
import java.util.*;
//java version 14.0.2;
//date 1-10-20;

public class ArrayList2 {
    public static void main(String []args){
        //trim the current array list
        ArrayList<String> t=new ArrayList<String>();
        t.add("Maths");
        t.add("Science");
        t.add("English");
        t.add("S.S");
        System.out.println("The original list is"+t);
        System.out.println("After trim the list is");
        t.trimToSize(); //trimming the array list using trimToSize() method
        //Increasing the capacity of arraylist
        t.ensureCapacity(8);
        t.add("Computer");
        t.add("Geometry");
        t.add("Physics");
        t.add("Chemistry");
        System.out.println(t);
    }
}

package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class Linkedlist5 {
    public static void main(String []args){
        //Creating linked list
        LinkedList<String> a=new LinkedList<String>();
        a.add("Red");
        a.add("Green");
        a.add("White");
        //Creating another linked list
        LinkedList<String> b=new LinkedList<String>();
        b.add("Violet");
        b.add("Pink");
        b.add("White");
        //Comparing two linked list
        LinkedList<String> c=new LinkedList<String>();
        for(String e:a){
            c.add(b.contains(e) ? "Yes":"No");
            System.out.println(c);

        }
        //converting Linked list into Array list
        System.out.println("The linked list is"+b);
        List<String> list=new ArrayList<String>(b);
        for(String e:list){
            System.out.println(e);
        }

    }
}

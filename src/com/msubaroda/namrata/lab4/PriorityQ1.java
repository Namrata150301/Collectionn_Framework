package com.msubaroda.namrata.lab4;
//java version 14.0.2;
import java.util.*;

public class PriorityQ1 {
    public static void main(String []args){
        //Creating empty Queue
        PriorityQueue<String> Q=new PriorityQueue<>();
        //inserting elements in the Queue
        Q.add("Red");
        Q.add("White");
        Q.add("Black");
        Q.add("Pink");
        Q.add("Blue");
        Q.add("Green");

        //Inserting elements into Queue using offer() method
        Q.offer("Neon");

        //Retreiving and removing first element of the Queue
        System.out.println("The Original Queue is"+Q);
        System.out.println("Removed element is:"+Q.poll());
        System.out.println("After removing element the Queue is:"+Q);

        //iterating over Queue
        for(String e:Q){
            System.out.println(e);
        }
        //Counting no. of elements in Queue
        System.out.println("Size of the Queue is "+Q.size());

        //Removing all elements from Priority Queue
        Q.clear();
        System.out.println(Q);
    }



}

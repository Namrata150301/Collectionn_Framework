package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class PriorityQ3 {
    public static void main(String []args){
        //Creating Priority Queue with initial capacity of 10
        PriorityQueue<Integer> pq=new PriorityQueue<>(10,Collections.reverseOrder());
        //Adding elements to Queue
        pq.add(11);
        pq.add(12);
        pq.add(13);
        pq.add(23);
        pq.add(82);
        pq.add(18);
        pq.add(67);
        System.out.println("Original Queue:"+pq);
        System.out.println("Maximum Priority Queue:");
        Integer val=null;
        while((val=pq.poll()) !=null){
            System.out.print(val+" ");
        }
        System.out.print("\n");
        //Creating Queue
        PriorityQueue<String> pq1=new PriorityQueue<>();
        //Adding elements to Queue
        pq1.add("White");
        pq1.add("Pink");
        pq1.add("Black");

        //Converting Priority Queue to a string representation
        String s;
        s=pq1.toString();
        System.out.println("String representation of Priority Queue is:"+s);


    }
}

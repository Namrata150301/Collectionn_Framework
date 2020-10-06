package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class PriorityQ2 {
    public static void main(String []args){
        //Creating empty Queue
        PriorityQueue<String> s=new PriorityQueue<>();
        //Adding elements to it
        s.add("White");
        s.add("Black");
        s.add("Pink");
        s.add("Blue");
        System.out.println("First priority Queue"+s);

        //Creating Another Queue
        PriorityQueue<String> s2=new PriorityQueue<>();
        //Adding elements to Queue
        s2.add("White");
        s2.add("Yellow");
        s2.add("Pink");
        s2.add("Blue");
        System.out.println("Second priority Queue"+s2);

        //comparing Two Queue
        PriorityQueue<String> result =new PriorityQueue<>();
        for(String e:s){
            System.out.println(s2.contains(e) ? "Yes":"No");
        }
        //Converting Priority Queue into Array list
        List<String> arr=new ArrayList<String>(s);
        System.out.println("Array containing all the elements in the queue are:"+arr);
    }
}

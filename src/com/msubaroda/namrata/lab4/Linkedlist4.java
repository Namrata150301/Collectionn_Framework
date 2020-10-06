package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class Linkedlist4 {
    public static void main(String []args){
        LinkedList<String> r=new LinkedList<String>();
        r.add("Maths");
        r.add("Science");
        r.add("English");
        r.add("S.S");
        r.add("Hindi");
        //Retrieve first element without removing element
        System.out.println("The original list is"+r);
       String x= r.peekFirst(); //peeking first element
        System.out.println("Peeked first element is"+x);

        String y=r.peekLast(); //peeking last element
        System.out.println("Peeked lat element is"+y);
        System.out.println("After peeking element the list is"+r);
        //Replacing element by use of set method
        r.set(2,"Chemistry");

        //Searching an particular element in linked list
        if(r.contains("Maths")){
            System.out.println("The element is present in the list "+r);
        }
        else{
            System.out.println("The element is not present in the list"+r);
        }

        //Checking whether the list is empty or not
        System.out.println("Checking the list is empty or not"+r.isEmpty());
        System.out.println("After replacing the element is"+r);


    }
}

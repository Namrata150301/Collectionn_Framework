package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class Linkedlist2 {
    public static void main(String []args){
        //linked list
                LinkedList<String> e= new LinkedList<String>();
                e.add("zebra");
                e.add("Dog");
                e.add("Cat");
                e.add("Lion");
                e.add("Tiger");
                e.add("Cheetah");
                e.add("Giraffe");
                e.offerFirst("Cow");//element at front
                e.offerLast("Buffalo");//element at last

        e.remove(2);//remove element at specified index
        e.removeFirst(); //remove element at first
        e.removeLast(); //remove element at
        System.out.println("The original list is"+e);
        //Swapping two elements in linked list
        //Swapping cheetah and zebra at index 0 and 4
        Collections.swap(e,0,4);
        System.out.println("The linked list is "+e);
        for(int i=0;i<e.size();i++){
            System.out.println("Element at specific index "+e+":"+e.get(i));
        }

    }
}

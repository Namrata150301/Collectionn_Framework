package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class Linkedlist3 {
    public static void main(String []args){
        LinkedList<String> c=new LinkedList<String>();
        c.add("Red");
        c.add("White");
        c.add("Orange");
        c.add("Black");
        c.add("Violet");
        //Creating another linked list
        LinkedList<String> d=new LinkedList<String>();
        d.add("Purple");
        d.add("Yellow");
        d.add("Blue");
        d.add("Pink");
        //Joining two linked list
        LinkedList<String> cd=new LinkedList<String>();
        cd.addAll(c);
        cd.addAll(d);
        System.out.println("The combined list is"+cd);
        c=(LinkedList)d.clone(); //clone linked list
        System.out.println("The clone list is"+c);

        //Remove and return first element of linked list.
        //By using pop method
        System.out.println("The original list is"+d);
        System.out.println("Remove element "+d.pop());//pop method removes first element from list
        System.out.println("After popping the new list is "+d);

        //System.out.println("The Original list is "+c);
        //shuffle the linked list randomly
        Collections.shuffle(c);
        System.out.println("After shuffling the list is "+c);
    }
}

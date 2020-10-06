package com.msubaroda.namrata.lab4;
//Linked list
//java version 14.0.2
import java.util.*;

public class Linkedlist1 {

    public static void main(String[] args) {
        //Creating Linked list
        LinkedList<String> l1 = new LinkedList<String>();
        //.add() method to adda elements to list
        l1.add("Rose");
        l1.add("Lotus");
        l1.add("Lily");
        l1.add("Mogra");
        l1.add("Daisy");
        //adding element in linked list at specified index
        l1.add(3,"Sunflower");
        //Inserting element in the linked list at specified position
        l1.addFirst("Jasmine");//inserting element at first position
        l1.addLast("Champa"); //inserting element at last position
        //iterate over the linked list
        //iterate linked list in reverse order
        Iterator a= l1.descendingIterator(); //descendingIterator method
        System.out.println("Printing the linked list in reverse order ");
        while(a.hasNext()){

            System.out.println(a.next());
        }
        Iterator b=l1.listIterator(2);
        while(b.hasNext()){
            //printing from the second element of the list

            System.out.println(b.next());

        }


    }
}




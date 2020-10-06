package com.msubaroda.namrata.lab4;
//java version 14.02
import java.util.*;
//java version 14.0.2
//date 2-10-20

public class Main {

    public static void main(String[] args) {
	//Creating new array list and add some colors(string)
        ArrayList<String> strlist=new ArrayList<String>();
        strlist.add("lion");
        strlist.add("Tiger");
        strlist.add("Cat");
        strlist.add("dog");
        strlist.add("Zebra");
        strlist.add("Giraffe");

        ArrayList<String> stringList = new ArrayList<String> ();
        stringList.add("Yellow");
        stringList.add("Tiger");
        stringList.add("Green");
        stringList.add("Orange");
        stringList.add("Zebra");
        stringList.add("Red");

        //retriving element from ArrayList
        stringList.add(1,"Purple");//Adding objects to the array list
        stringList.remove(3);//Removing objects from the ArrayList
        stringList.add(4,"Brown");
        stringList.set(1,"Violet"); //Used to replace specified element from list
        Collections.sort(stringList);//sorting the Arraylist.
        //iterating through Arraylist using for loop
        //Collections.copy(stringList,strlist);//copying one arraylist into another.
        //Collections.reverse(stringList);//reversing the array List.
        //Collections.shuffle(strlist);//shuffle the array list.
        //Extracting a portion from arraylist
        List<String> newlist =strlist.subList(0,4);
        System.out.println("The new list is:"+newlist);
        //Check whether the arraylist is empty or not.
        System.out.println(stringList.isEmpty());
        //To empty an arraylist
        System.out.println();
        //Comparing two arraylist
        ArrayList<String> templist=new ArrayList<String>();
        for(String e:strlist)
            templist.add(stringList.contains(e) ? "Yes" : "No");
        System.out.println(templist);
        //join two array list
        ArrayList<String> b=new ArrayList<String>();
        b.addAll(stringList);
        b.addAll(strlist);
        System.out.println("The New Array is "+b);


        }


    }



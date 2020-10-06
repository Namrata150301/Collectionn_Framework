package com.msubaroda.namrata.lab4;
//java version 14.0.2
import java.util.*;

public class TreeSet2 {
    public static void main(String []args){
        //Creating Empty TreeSet
        TreeSet<Integer> t1=new TreeSet<>();
        TreeSet<Integer> treeheadset=new TreeSet<>();
        //Adding Numbers to Set
        t1.add(1);
        t1.add(2);
        t1.add(3);
        t1.add(4);
        t1.add(5);
        t1.add(6);
        t1.add(7);
        t1.add(8);

        //Creating another TreeSet
        TreeSet<Integer> t2=new TreeSet<Integer>();
        t2.add(1);
        t2.add(2);
        t2.add(4);
        t2.add(4);
        t2.add(6);
        t2.add(6);
        t2.add(7);
        t2.add(7);
        //Comparing Two TreeSet
        TreeSet<Integer> result=new TreeSet<>();
        for(Integer e:t1){
            System.out.println(t2.contains(e) ? "Yes" : "No");
        }

        //Finding numbers less than 7
        treeheadset=(TreeSet)t1.headSet(7);
        //Create an iiterator
        Iterator iterator;
        iterator=treeheadset.iterator();
        //Displaying elements
        System.out.println("Elements in TreeSet are");
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        //Adding all elements of TreeSet to another Treeset
        TreeSet<Integer> t3=new TreeSet<>();
        t3.addAll(t1);
        System.out.println("Adding all elements of t1 TreeSet to another Set");
        System.out.println(t3);



    }
}

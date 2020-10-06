package com.msubaroda.namrata.lab4;
import java.util.*;
//java version 14.0.2;
//date 1-10-20

public class Arraylist3 {
    public static void main(String []args){
        ArrayList<String> flower=new ArrayList<String>();
        flower.add("Rose");
        flower.add("Lotus");
        flower.add("Lily");
        System.out.println("The original list is"+flower);
        //Replace the second element to other specified element
        String new_flower="Daisy";
        flower.set(1,new_flower); //set the element to second index
        int n= flower.size();
        System.out.println("After replacing the element");
        //printing the element as per the index
        int no_of_ele=flower.size();
        for(int index=0;index<no_of_ele;index++){
            System.out.println(flower.get(index));
        }




    }
}

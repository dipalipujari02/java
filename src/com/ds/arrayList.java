package com.ds;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class arrayList  {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();

        //add element
        l1.add(11);
        l1.add(27);
        l1.add(39);
        l1.add(43);
        l1.add(59);
        System.out.println(l1);


        //to get the element
        int element = l1.get(0);
        System.out.println(element);
       // System.out.println(l1.get(0));


        //add element in between
        l1.add(0,4);
        System.out.println(l1);

        //change the the element
        l1.set(2,8);
        System.out.println(l1);


        //delete element
        l1.remove(3);
        System.out.println(l1);


        //size of list
        int size = l1.size();
        System.out.println(size);

        //loop on list
        for(int i =0;i<l1.size();i++){
            System.out.println(i+ " " + l1.get(i));
        }
        System.out.println();


        //sorting the list

        Collections.sort(l1);
        System.out.println(l1);

    }
}

package com.generic;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        GenericDemo genericDemo = new GenericDemo();
        genericDemo.greet("dipa");
        genericDemo.greet("Aishu");
        genericDemo.greet("Madhura");
        genericDemo.greet(12);

        GenericDemo genericDemo1 = new GenericDemo();
        genericDemo1.arr();

    }
    public <T> void greet(T name){
        System.out.println("hello "+name);
    }

    public <Integer>void arr(){
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add("om");
        list.remove(1);
        System.out.println(list);
    }
}

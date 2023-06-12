package com.abstraction;

public abstract class Bird {
    abstract void fly();  //abstract method

    abstract void eat();

     void walk () {
         System.out.println("bird can walk");
     }

     void see(){
         System.out.println("Bird can see");
     }
}

package com.bridgelabz.OOPS;

public class Animal {
    static String name;
    String color;
    int legs;

    public void printInfo(){
        System.out.println("animal name :"+name);
        System.out.println("color of aminal :" +color);
        System.out.println("Number of legs animal have :"+legs);
    }

    Animal(){

    }
    Animal(Animal a4){
        this.name=a4.name;
        this.color=a4.color;


    }
    Animal(String name, String color, int legs){
        this.name=name;
        this.color=color;
        this.legs=legs;
    }
}

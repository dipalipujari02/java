package com.poly;
  //class override
public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("dog can eat");
    }

    void walk(){
        System.out.println("dog can walk");
    }

    void sound(String name){
        System.out.println("dog makes sound ");
    }
}

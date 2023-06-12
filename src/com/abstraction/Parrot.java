package com.abstraction;

public class Parrot extends  Bird{


    @Override
    void fly() {
        System.out.println("Parrot can fly");
    }

    @Override
    void eat() {
        System.out.println("Parrot eat chilly");
    }

    @Override
    void walk() {
        System.out.println("Parrot can walk");
    }
}

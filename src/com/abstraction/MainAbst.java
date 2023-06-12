package com.abstraction;

public class MainAbst {
    public static void main(String[] args) {
        Bird bird = new Parrot();
        Parrot parrot = new Parrot();
        bird.eat();
        parrot.eat();
        parrot.walk();
        bird.walk();
        bird.see();
        parrot.see();
    }
}

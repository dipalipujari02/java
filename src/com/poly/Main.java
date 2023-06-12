package com.poly;


// inheritance

public class Main {
    public static void main(String[] args) {
        //       ArithmaticOperations m1 =new ArithmaticOperations();
        //       m1.sumOfTwoNum();

        //     System.out.println(m1.sumOfTwoNum(40,90));
        //       System.out.println(m1.sumOfTwoNum(8.7,9));
        //       System.out.println(m1.sumOfTwoNum(23.4f,7));

        Animal obj = new Animal();
        Dog moti = new Dog();
        obj.eat();
        obj.walk();

        moti.eat();
        moti.walk();

      //  moti.sound();

        moti.sound("moti");



    }

}

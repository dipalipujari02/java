package com.functionalInterface;

public class Main {
    public static void main(String[] args) {
//        Greeting h1 = ()->{
//                System.out.println("hi all");
//
//        };
//
 //       h1.greet();
//
//        Addition addition = (int a , int b)->{
//            //Addtion addition =(a,b)->a+b;
//            return a+b;
//        };
//
//        addition.add(2,3);
//        System.out.println(addition.add(2,3));

        Addition addition =(a,b) ->a+b;
        System.out.println(addition.add(5,7));

        Greeting hi = new Greeting() {
            @Override
            public void greet() {
                System.out.println("hi");
            }
        };

    }
}

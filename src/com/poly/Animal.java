package com.poly;

public class Animal {
    void walk(){
        System.out.println("Animal can walk");
    }

    void  eat(){
        System.out.println("Animal can eat");
    }
  //static method can not be override
//    void static eat(){
//        System.out.println("Animal can eat");
//    }
    public void sound(){

        System.out.println("Animal makes sound");
    }
}

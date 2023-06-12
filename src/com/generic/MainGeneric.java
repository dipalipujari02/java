package com.generic;

public class MainGeneric {
    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<>(10);
        System.out.println(genericClass.data);

        GenericClass<String> genericClass1 = new GenericClass<>("Digu");
        System.out.println(genericClass1.data);


    }
}

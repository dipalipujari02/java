package com.bridgelabz;

import java.util.Scanner;

public class MyMethod {
    public static void sum(int a,int b) {
        int c = a + b;
        System.out.println("The sum of A and B is ="+ c);
    }

    public static void main(String[] args) {
        System.out.println("enter the num1");
        System.out.println("Enter the num2");
        System.out.println("without arg");
        sum();
        System.out.println("with arg");
        sum(3,4);
    }

    public static void sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of A and B is ="+ c);
    }
}

package com.bridgelabz;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and name ");
        int num = sc.nextInt();
        String name = sc.nextLine();
        System.out.println(num + name);
    }
}

package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sum");
        int sum = sc.nextInt();
        for (int i = 0; i <= myArray.length - 1; i++) {
            for (int j = i + 1; j <= myArray.length - 1; j++) {
                if (sum==myArray[i] + myArray[j]) {
                    System.out.println( "first no = "+myArray[i]+" index is "+ i +" second no = " +myArray[j]+" index is "+j);

                }
            }
        }
    }
}
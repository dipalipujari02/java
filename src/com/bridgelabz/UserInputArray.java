package com.bridgelabz;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array element");

        for(int i =0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array element");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

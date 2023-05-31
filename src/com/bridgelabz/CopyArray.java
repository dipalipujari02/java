package com.bridgelabz;
import java.util.Arrays;
public class CopyArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = new int[4];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
          //  System.out.println(array2[i]);

        }
            System.out.println(Arrays.toString(array2));
    }
}
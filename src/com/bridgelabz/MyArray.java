package com.bridgelabz;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        int[] myArray = new int[5];
     /*   datatype[] arrayName = new datatype[size];
        int rollNo1 = 12;
        int rollNo2 = 13;
        int[]rollNo ={12,13,14,15};  */
        myArray[0] = 12;
        myArray[1] = 13;
        myArray[2] = 14;
        myArray[3] = 15;
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[myArray.length-1]);       //access reverse order
        System.out.println(myArray[myArray.length-2]);
        System.out.println(Arrays.toString(myArray));        //access all element in array

        //foreach loop only for Array used
       /*for(int element: myArray){
              System.out.println(element);
           // if(element%2==0){
              //  System.out.println(element);
            }*/
     /*   for (int i = 0; i <= myArray.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println(myArray[i]);
            }
        }*/


//        for (int i = 0; i <= myArray.length-1; i++) {
//            if(i%2==0){
//            System.out.println(myArray[i]);
//        }
//    }
//        int sum = 0;
//        for (int i = 0; i <= myArray.length-1;i++){
//            sum=sum+i;
//            System.out.println(sum);
//        }
        int count =0;
        for(int i=0;i<= myArray.length-1;i++){
            count =count+1;

        //count of even number
//        int count = 0;
//        for(int i=0;i<=myArray.length;i++) {
//            if (i % 2 == 0) {
//                count++;
//            }
        }
       // System.out.println("count of even number" + count);
        System.out.println("Total no present is Array is "+count);
    }
    }


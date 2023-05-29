package com.bridgelabz;

public class SumOfNumber {
    public static void main(String[] args) {
       /* int j;
        int sum = 0;
        for (j=1;j<11;j++){
            sum = sum + j;
          //  System.out.println("sum of first 10 Number"+sum);

        }
        System.out.println("sum of first 10 number = "+sum);     */
        sum();
    }

    public static void sum() {
        int i;
        int sum = 0;
        int count =0;
        for(i=1;i<11;i++){
            sum = sum + i;
            count=count+1;
        }
        System.out.println("sum of first 10 number "+sum);
        System.out.println("count is "+count);
    }
}

package com.bridgelabz;

public class CountOfEvennumber {
    public static void main(String[] args) {
       int count = 0;
       for(int i=0;i<=100;i++) {
           if (i % 2 == 0) {
               count = count+1;
           }
       }
         System.out.println("count of even number" + count);
    }
}

package com.bridgelabz;

public class array2D {
    public static void main(String[] args) {
     //   int[][] arr = new int[3][3];
      //datatype[][] arr = new datatype[rows][column];
      //int[][] arr = {{},{},{}};

        int[][] arr = {{1,2,3},{4,6,7},{8,9,6}};
        System.out.println(arr[0][0]);

        for(int i =0;i<= arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

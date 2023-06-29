package com.bridgelabz;

public class DuplicateElement {
    public static void main(String[] args) {
        int []arr = {70,20,60,50,10,20,40,56};
        int sum =0;
        int maximum=arr[0];

            for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        System.out.println("maximum element ="+maximum);

//            for(int i =0; i<arr.length;i++)
//              for(int j =i+1;j<arr.length;j++){
//                  if(arr[i] == arr[j]){
//                    System.out.println(arr[j]);
//                   sum = sum+arr[i];
//                  }
//              }
//        System.out.println("sum of duplicate element ="+sum);
    }
}






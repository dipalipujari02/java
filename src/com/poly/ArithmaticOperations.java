package com.poly;


    //class overloading
public class ArithmaticOperations {
    void sumOfTwoNum(){
        int a =10;
        int b =20;
        int sum = a+b;
        System.out.println(sum);
    }

    int sumOfTwoNum(int a,int b){
        return a+b;
    }

    double sumOfTwoNum(double a, int b){
        return a+b;
    }

    float sumOfTwoNum(float a, int b){
        return a+b;
    }
}

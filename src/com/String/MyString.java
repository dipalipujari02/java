package com.String;

public class MyString {
    String name = "dipa";  //litral
    String name1 = new String("sanu"); //new keyword  // String is a class therfore we creat obj

    char[] chars ={'d','i','g','u'}; //characters
    String name2 = new String(chars);


    public static void main(String[] args) {


        String s1 = "Abc";
        String s2 = "Abc";
        String s3 = new String("Abc");
        String s4 = new String("Abc");
        String s5 = "Bcm";

        System.out.println(s1 == s5); //cheek add //not allow duplicate name
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s2)); //ckeek valu
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));


    }
}

package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputToCheckPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,5}");
//        Matcher m = p.matcher("DIpali");
//        boolean conditionCheck = m.matches();
//        System.out.println("first name = "+conditionCheck

        System.out.println("Enter first name = ");
        String firstname = sc.nextLine();
        Matcher m = p.matcher(firstname);
         if(m.matches()){
             System.out.println("Valid pattern");
         }else{
             System.out.println("enter valid pattern");
         }

    }
}

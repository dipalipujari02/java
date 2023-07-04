package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {


        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,5}");
        Matcher m = p.matcher("Dipali");
        boolean conditionCheck = m.matches();
        System.out.println("first name = "+conditionCheck);


        Pattern p2 = Pattern.compile("^[A-Z]{1}[a-z]{2,5}");
        Matcher l = p2.matcher("Pujari");
        boolean lastname = l.matches();
        System.out.println("last name = "+lastname);



        Pattern pm = Pattern.compile("^[+0-9]{3}\s[0-9]{10}");
        Matcher mo = pm.matcher("+91 9359251416");
        boolean mobile = mo.matches();
        System.out.println("mobile no = "+mobile);

        Pattern pp = Pattern.compile("^[0-9]{6}");
        Matcher pin = pp.matcher("416303");
        boolean pincode  = pin.matches();
        System.out.println("pincode = "+pincode);

        Pattern pfullname = Pattern.compile("^[A-Z]{1}[a-z]{2,}\s[A-Z]{1}[a-z]{2,5}\s[A-Z]{1}[a-z]{2,}");
        Matcher fullname = pfullname.matcher("Digvijay Mahesh Pujari");
        boolean fname  = fullname.matches();
        System.out.println("full name = "+fname);




        Pattern pmail = Pattern.compile("^[a-z0-9]{1,}[@*&^%$#!]{1}[a-z]{1,5}[.]{1}[a-z]{2,3}");
        Matcher m2 = pmail.matcher("dipalipujari02@gmail.com");
        boolean mail  = m2.matches();
        System.out.println("mail  = "+mail);



//        Pattern pmail = Pattern.compile("^[A-Za-z0-9@.!#4%^&*~-]{1,}");
//        Matcher m2 = pmail.matcher("dipalipujari02@gmail.com");
//        boolean mail  = m2.matches();
//        System.out.println("mail  = "+mail);



        Pattern p3 = Pattern.compile("[A-Z]{1,8}[!@#$%^&*]{1}[0-9]{1,8}");
        Matcher m3 = p3.matcher("SANU@145");
        boolean pass  = m3.matches();
        System.out.println("password  = "+pass);

        Pattern p4 = Pattern.compile("^[a-zA-Z]{1,}\s[0-9]{1,5}");
        Matcher m4 = p4.matcher("DipaliPujari 1999");
        if(m4.matches()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }











    }
}

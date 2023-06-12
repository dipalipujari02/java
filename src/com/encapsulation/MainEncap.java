package com.encapsulation;

public class MainEncap {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccNo(123);
        acc.setName("dipa");
//      acc.getAccNo();
//      acc.getName();
        System.out.println(acc.getAccNo());
        System.out.println(acc.getName());

//        Bank2 acc1 =new Bank2();
//        acc1.setAccNo(12);
//        acc1.getAccNo();
//        System.out.println(acc1.getAccNo());

    }
}

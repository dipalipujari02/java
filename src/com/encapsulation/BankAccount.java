package com.encapsulation;

public class BankAccount {
    private int accNo;
    private String name;

    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
}

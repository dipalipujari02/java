package com.poly;

public class MainAccount {
    public static void main(String[] args) {
        Account account = new Account(12 ,"saving");

        Employee employee = new Employee(12, "Aishu", "M.Sc",account);

        employee.displayDetail();
    }
}

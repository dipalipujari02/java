package com.poly;
public class Employee {
    // Instance variable
    Integer empId;
    String empName;
    String empDesignation;

    // HAS-A relation
    Account account;

    public Employee(Integer empId, String empName, String empDesignation, Account account) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.account = account;
    }
    public void displayDetail(){
        System.out.println("Employee Details");
        System.out.println("Emp Id :: " + empId);
        System.out.println("EmpName :: " + empName);
        System.out.println("Emp Designation " + empDesignation);

        System.out.println();

        System.out.println("Account details");
        System.out.println("Account number :: " + account.getAccNo());
        System.out.println("Account type :: " + account.getAccType());
    }
}
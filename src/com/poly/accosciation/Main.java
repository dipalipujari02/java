package com.poly.accosciation;

public class Main {
    public static void main(String[] args) {
        Employees employee1 = new Employees(123,"Philips");
        Employees employee2 = new Employees(456,"Ashish");
        Employees employee3 = new Employees(789,"Surbhi");

        Employees[] employees = new Employees[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        Department department = new Department(12,"Engineering",employees);
        department.show();
    }
}

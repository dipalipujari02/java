package com.poly.accosciation;

public class Department {
    private Integer depId;
    private String depName;

    Employees[] employees;


    public Department(Integer depId, String depName, Employees[] employees) {
        this.depId = depId;
        this.depName = depName;
        this.employees = employees;
    }

    public void show(){
        System.out.println("********Department details*********");
        System.out.println("====================================");
        System.out.println("depart Id :: " + depId);
        System.out.println("Depart Name :: " + depName);

        System.out.println("****************************************");
        System.out.println("*********Employee details***************");

        for (Employees emp : employees) {
            System.out.println("Emp Id ::" + emp.getEmpId());
            System.out.println("Emp Name :: " + emp.getEmpName());

        }
    }
}
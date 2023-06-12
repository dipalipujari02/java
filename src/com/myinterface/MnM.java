package com.myinterface;

public class MnM implements Car,DemoInterface{
    @Override
    public void drive() {
        System.out.println("4 wheel");
    }

    @Override
    public void brake() {
        System.out.println("abs");
    }

    @Override
    public void gearShift() {
        System.out.println("Automatic");
    }

    @Override
    public void demoMethod() {
        System.out.println("two interface are used");
    }
}

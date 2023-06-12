package com.myinterface;

public class Tatacar implements Car{
    @Override
    public void drive() {
        System.out.println("Tata car is 4 wheel drive");
    }

    @Override
    public void brake() {
        System.out.println("has abs");
    }

    @Override
    public void gearShift() {

        System.out.println("Automatic ");
    }
}

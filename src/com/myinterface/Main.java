package com.myinterface;

public class Main {
    public static void main(String[] args) {
        Tatacar t1 = new Tatacar();
        t1.drive();
        t1.brake();
        t1.gearShift();

        MnM m1 = new MnM();
        m1.brake();
        m1.drive();
        m1.gearShift();
        m1.demoMethod();
    }
}

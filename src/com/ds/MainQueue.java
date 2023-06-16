package com.ds;

public class MainQueue {
    public static void main(String[] args) {

        MyQueue q1 = new MyQueue();

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);



        q1.dispalyq();
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        q1.dispalyq();
        System.out.println(q1.isEmpty());
        System.out.println(q1.size());
    }
}

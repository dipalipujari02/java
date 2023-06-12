package com.ds;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);


        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(a.data);
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(b.next);


    }
}

package com.ds;

public class MainDs {
    public static void main(String[] args) {

        DemoLinkedList ll = new DemoLinkedList();
        ll.inestAtEnd(10);
        ll.inestAtEnd(20);
        ll.inestAtEnd(30);
        ll.inestAtEnd(40);
        ll.inestAtEnd(20);

        
        ll.insertAtStart(5);
        ll.insertInBetween(3,15);
     //   ll.RemoveNode(2,20);
        ll.display();
        System.out.println(ll.getsize());
    }
}
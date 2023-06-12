package com.ds;

public class DemoLinkedList {
    Node head;
    Node tail;

    void inestAtEnd(int data){
        Node temp = new Node (data) ;
        if(head == null){
            head = temp;
        }else{
            tail.next = temp;
        }
        tail = temp;
    }

    void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    int getsize(){
        Node temp = head;
        int count = 0;
        while(temp.next != null){
            count ++;
            temp = temp.next;
        }
        count++;
        return count;
    }
     void insertAtStart(int data){
        Node temp = new Node(data);
        if(head == null){
            head = tail = temp;
  //          tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
     }

     void insertInBetween(int Index , int data) {
         Node t = new Node(data);

         Node temp = head;
         for (int i = 1; i <= Index - 1; i++) {
             temp = temp.next;
         }
         t.next = temp.next;
         temp.next =t;
     }

//     void deleteNode(int position ,int data){
//        Node a = new Node(data);
//        Node temp =head;
//        if(position == 1){
//            temp.next = head;
//            temp=head;
//        }else {



 //       }

   //  }

}







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

     void deleteNode(int position){
        Node temp =head;
        if(position == 0){
            temp = temp.next;
            return;
        }
          for(int i =0;i<position-1;i++){
              temp=temp.next;
          }
              temp.next=temp.next.next;
          }
     void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        head = head.next;
     }

     void deleteLast(){
        if(head==null){
            System.out.println("empty");
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
     }


        }










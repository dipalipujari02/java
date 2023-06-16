package com.ds;

public class MyQueue {
    int[] queue = new int[5];
    int rear;
    int front;
    int size;

    public void enqueue(int data) {
        queue[rear] = data;
        rear++;
        size++;
    }

    public int dequeue() {
        int data = queue[front];
        front++;
        size--;
        return data;
    }

    public void dispalyq() {
        for (int i = 0; i <= size; i++) {
            System.out.println(queue[i]);
            //System.out.println(queue[rear-1]);
        }
          System.out.println(queue[rear-1]);

    }

    public int size() {
        return rear;
    }
        public boolean isEmpty () {

        return front-1 ==-1;
    }
}




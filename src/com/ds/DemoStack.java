package com.ds;

public class DemoStack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public void show() {
        for (int n : stack) {
            System.out.println(n);

        }
    }

    public int peek() {
        int data;
        data = stack[top - 1];
        return data;
    }

    public int size() {

        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public boolean isFull() {

        return top >= stack.length;
    }

    public int delete() {
        stack[top-1] = top;
        top--;
        return top;
    }
}
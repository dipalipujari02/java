package com.ds;

public class MainDemoStaack {
    public static void main(String[] args) {

       DemoStack demostack = new DemoStack();
        demostack.push(10);
        demostack.push(20);
        demostack.push(30);
        demostack.push(40);

      demostack.show();
//        System.out.println(demostack.peek());
        System.out.println(demostack.size());
//
//       System.out.println(demostack.isEmpty());
//        System.out.println(demostack.isFull());
        System.out.println(demostack.delete());
      //  demostack.show();

    }
}

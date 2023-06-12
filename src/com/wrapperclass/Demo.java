package com.wrapperclass;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
      int i = Integer.parseInt("10");
        System.out.println(i);

       String s = Integer.toString(10);
        System.out.println(s);

        float f = Float.parseFloat(Float.toString(23.4f));
        System.out.println(f);

        String d = Double.toString(10.3);
        System.out.println(d);


        //AutoBoxing
        //  valueOf() ----converting primitive into wraper object
        Integer z =Integer.valueOf("10");
        System.out.println(i);

        Integer i1 =10;
        System.out.println(i1);

//        //Autounboxing
        // intValue()----converting wrapper object into primitive data
        int b = i1.intValue();
        int c = i1;

        //DemoArray

        ArrayList list = new ArrayList();
        list.add(10);
        list.add(13);
        list.add(90);
        list.add("om");
        list.remove(1);
        System.out.println(list);

//        ArrayList<String> list = new ArrayList();
//        list.add(10);
//        list.add(13);
//        list.add(90);
//        list.add("om");
//        System.out.println(list);
//
   }
}

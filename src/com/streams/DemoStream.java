package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,34,87,45,23);
      //  Stream<Integer> streamdata = numbers.stream();
    //    streamdata.forEach(n -> System.out.println(n));
     //   Stream<Integer> procceddata = numbers.stream();
     //   streamdata.filter(n->n%2==0).forEach(n-> System.out.println(n));

     //   numbers.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));


      int result =  numbers.stream()
              //  .filter(n->n%2==0)
             //   .map(n->n*2)
                .reduce(0,(a,b)->a+b);

        System.out.println(result);
           //     .forEach(n-> System.out.println(n));


    }
}

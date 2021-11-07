package com.api.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> arList=new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(5);
        List<Integer> newA1=new ArrayList<>();
        newA1=arList.stream().filter(x -> x>=15).collect(Collectors.toList());
        newA1.stream().forEach(x -> System.out.println(x));
        System.out.println("----------------");
        Stream<Integer> s=arList.stream().filter(i -> i%3==0);
        s.forEach(x -> System.out.println(x));
        System.out.println("----------------");
        arList.stream().filter(i -> i%5==0).sorted((i1,i2) -> i1.compareTo(i2)).forEach(x -> System.out.println(x));

        System.out.println("----------------");
        arList.stream().filter(i -> i%3==0).forEach(x -> System.out.println(x));
        System.out.println("----------------");
        long filterCount=arList.stream().filter(i -> i%3==0).count();
        System.out.println(filterCount);


        System.out.println("------MIN----------");
        Integer minVal=arList.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(minVal);

        System.out.println("------MAX----------");
        Integer maxVal=arList.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(maxVal);

        System.out.println("------TO ARRAY----------");
        Object[] o1=arList.stream().filter(i -> i%5==0).toArray();
        for(Object o:o1){
            System.out.println(o);
        }
    }
}

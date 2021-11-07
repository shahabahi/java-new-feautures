package com.api.lambda;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LabdaDemo {
    public static void main(String[] args) {
        //BiConsumer is a pre defined functional interface
        BiConsumer<Integer,Integer> biConsumer=(a,b) -> System.out.println(a+b);
        biConsumer.accept(10,5);

    }
}

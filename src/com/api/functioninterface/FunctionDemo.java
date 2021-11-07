package com.api.functioninterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // First Integer @param <T> the type of the input to the function
        // Second Integer @param <R> the type of the result of the function
        Function<Integer,Integer> squareMe= i->i*i;
        System.out.println("square of 5 is : " + squareMe.apply(5));
    }
}

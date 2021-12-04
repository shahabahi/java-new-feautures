package com.api.stringhandling;

import java.util.Arrays;

public class StringHandleDemo {
    public static void main(String[] args) {
        System.out.println(String.format("The name of Student is "+ "%s, and the the age is "+ "%d","Shahab",10));
        String str1="Hi Shahab how are you ?";
        String[] arr=str1.split(" ");
        Arrays.asList(arr).forEach(s -> System.out.println(s));

    }
}

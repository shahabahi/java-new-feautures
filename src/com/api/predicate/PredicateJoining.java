package com.api.predicate;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        Predicate<String> checkLength= s -> s.length() >= 5;
        System.out.println("The length of String is grater than 5 : " + checkLength.test("code decode"));

        Predicate<String> checkEvenLength= s -> s.length() %2==0;
        System.out.println("The length of String is : " + checkEvenLength.test("code decode"));

        System.out.println("After merging with and : " + checkLength.and(checkEvenLength).test("code decode"));

        System.out.println("After merging with or : " + checkLength.or(checkEvenLength).test("code decode"));

        System.out.println("After merging with negate : " + checkLength.negate().test("code decode"));
    }
}

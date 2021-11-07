package com.api.functionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void singleAbstMethod();

    default void printName(){
        System.out.printf("Welcome");
    }
}

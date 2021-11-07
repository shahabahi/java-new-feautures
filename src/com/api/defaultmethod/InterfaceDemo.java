package com.api.defaultmethod;

public interface InterfaceDemo {
    void abstractMethod();

    default void printName(){
        System.out.println("This is default method");
    }
}

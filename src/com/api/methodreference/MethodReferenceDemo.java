package com.api.methodreference;

import com.api.functionalinterface.FunctionalInterfaceDemo;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        FunctionalInterfaceDemo interfaceDemo=Test::testImplementation;
        interfaceDemo.singleAbstMethod();

        //instead of method reference we can use labda expression
//        FunctionalInterfaceDemo interfaceDemo=() -> System.out.println("Implementation of SAM");
//        interfaceDemo.singleAbstMethod();
    }
}
class Test {
    public static void testImplementation() {
        System.out.println("this is test implementation of your abstract method");
    }
}
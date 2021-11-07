package com.api.defaultmethod;

public class mainClass {
    public static void main(String[] args) {
        InterfaceDemoImpl interfaceDemo=new InterfaceDemoImpl();
        // printName method is not implemented in InterfaceDemoImpl class but in has its default implementation in its interface
        interfaceDemo.printName();
    }
}

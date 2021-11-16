package com.api.designpattern.structuralpattern.proxy;

public class RealSubjectClass implements Subject{
    @Override
    public void method() {
        System.out.println("I am an actual implementation od subject");
    }
}

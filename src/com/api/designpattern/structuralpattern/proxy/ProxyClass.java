package com.api.designpattern.structuralpattern.proxy;

public class ProxyClass extends RealSubjectClass{
    @Override
    public void method() {
        System.out.println("I am proxy");
        //if you pass the Authentication then the real object will be create
        super.method();
    }
}

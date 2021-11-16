package com.api.designpattern.creationalpatterns.singleton;

public class SingletonClass {
    private static SingletonClass singletonInstance=new SingletonClass();

    private SingletonClass() {
    }
    public static SingletonClass getInstance(){
        return singletonInstance;
    }
    public void simpleMethod(){
        System.out.println("hashcode of singleton object is : " +singletonInstance);
    }

}

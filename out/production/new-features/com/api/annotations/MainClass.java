package com.api.annotations;

import java.lang.reflect.Method;

public class MainClass {

    @MarkerAnnotation(value = 10)
    public void sayHello() {
        System.out.println("My Custom Annotation");
    }

    public static void main(String[] args) throws Exception{
        MainClass mainClass = new MainClass();
        Method method = mainClass.getClass().getMethod("sayHello");
        MarkerAnnotation markerAnnotation=method.getAnnotation(MarkerAnnotation.class);
        System.out.println("value is: " +markerAnnotation.value());
    }
}

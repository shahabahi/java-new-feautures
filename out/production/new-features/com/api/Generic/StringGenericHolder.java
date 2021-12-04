package com.api.Generic;

public class StringGenericHolder<T> {
    T obj;

    public StringGenericHolder(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        StringGenericHolder<Integer> iObj = new StringGenericHolder<Integer>(10);
        System.out.println(iObj.getObj());
        StringGenericHolder<String> strObj = new StringGenericHolder<String>("Simple Code");
        System.out.println(strObj.getObj());

    }
}

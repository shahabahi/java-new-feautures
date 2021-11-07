package com.api.stream;

import java.util.stream.Stream;

public class OfDemo {
    public static void main(String[] args) {

        Stream.of(1,11,21,34).filter(x -> x<=11).forEach(x -> System.out.println(x));

        String[] name={"code","ali","Hamid reza"};
        Stream.of(name).filter(x -> x.length()<=4).forEach(x -> System.out.println(x));
    }
}

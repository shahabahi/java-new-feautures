package com.api.e;

import java.util.List;

public class TypeInferencesRunner {
    public static void main(String[] args) {
        List<String> names1= List.of("Shahab","Asal");
        List<String> names2= List.of("Somayeh","Ghazal");
//        List<List<String>> names= List.of(names1,names2);
        var names= List.of(names1,names2);
        names.stream().forEach(System.out::println);
    }
}

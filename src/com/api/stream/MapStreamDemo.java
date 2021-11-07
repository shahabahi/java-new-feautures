package com.api.stream;

import java.util.ArrayList;
import java.util.List;

public class MapStreamDemo {
    public static void main(String[] args) {
        List<Integer> arList=new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(5);
        arList.stream().map(i -> i*2).forEach(x -> System.out.println(x));

    }
}

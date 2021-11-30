package com.api.camparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Laptop> laptop = new ArrayList<>();
        laptop.add(new Laptop("Del", 16, 800));
        laptop.add(new Laptop("Apple", 8, 1200));
        laptop.add(new Laptop("Acer", 12, 700));

        Collections.sort(laptop);
        System.out.println(laptop);

//        Comparator<Laptop> com = new Comparator<Laptop>() {
//            @Override
//            public int compare(Laptop o1, Laptop o2) {
//                if (o1.getRam() > o2.getRam())
//                    return 1;
//                else
//                    return -1;
//            }
//        };
        Comparator<Laptop> com = (o1, o2) -> {
            if (o1.getRam() > o2.getRam())
                return 1;
            else
                return -1;
        };
        Collections.sort(laptop,com);
        System.out.println(laptop);


    }
}

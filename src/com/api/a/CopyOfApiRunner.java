package com.api.a;

import java.util.ArrayList;
import java.util.List;
//java 10
public class CopyOfApiRunner {

    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("Shahab");
        names.add("Asal");
        names.add("Ghazal");
        //Unmodifiable Collection
        List.of("Shahab","Asal","Ghazal");
        List<String> copyOfNames=List.copyOf(names);


        doNotChange(names);
        System.out.println(names);
        System.out.println(copyOfNames);
    }
    private static void doNotChange(List<String> names){
        names.add("salam");
    }

}

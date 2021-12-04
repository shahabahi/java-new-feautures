package com.api.autoboxing;

public class AutoboxingDemo {
    public static void main(String[] args) {
        int i = 10;
        //Autobox
        Integer intObj = Integer.valueOf(i);
        System.out.println("value of Integer intObj: " + intObj);

        //Auto-unboxing
        Character charObj = 'a';
        char ch = charObj;
        System.out.println("Value of ch:" + ch);
        System.out.println("Value of charObj:" + charObj);

        //Auto-unboxing
        int i1=intObj;
        System.out.println("value of i1 = " +i1);

        //Auto-unboxing
        char x='a';
        Character  charObj1=Character.valueOf(x);
        char ch1=charObj1;
        System.out.println("Value of ch1 : " + ch1);
        System.out.println("Value of charObj1 : " + charObj1);


    }
}

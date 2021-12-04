package com.api.enumeration;

public class MainClass {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println("Red enum name: " + c1.name());
        System.out.println("Red enum value: " + c1.getValue());
        for (Color color : Color.values()) {
            System.out.printf("Enum value: " + color.getValue()+"\n");
            System.out.printf("Enum name: " + color.name()+"\n");
        }
    }
}

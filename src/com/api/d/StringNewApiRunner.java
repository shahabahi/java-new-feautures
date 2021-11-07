package com.api.d;

public class StringNewApiRunner {
    public static void main(String[] args) {
        //java 11
        System.out.println("".isBlank());
        System.out.println(" LR ".strip());
        System.out.println(" L R ".strip().replace(" ","@"));
        System.out.println(" LR ".stripLeading());
        System.out.println(" L R ".stripLeading().replace(" ","@"));
        System.out.println(" LR ".stripTrailing());
        System.out.println(" L R ".stripTrailing().replace(" ","@"));
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
        String s="UPPER";
        var result = "foo".transform(input -> input + " bar");
        System.out.println(result); // foo bar
        var result1 = "UPPER".transform(input -> input.substring(2));
        System.out.println(result1);


        var result2 = "My name is %s. My Age is %d. ".formatted("Shahab",46);
        System.out.println(result2);


    }
}

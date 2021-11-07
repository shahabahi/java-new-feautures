package com.api.g;

public class TextBlockRunner {
    public static void main(String[] args) {
        String str = """
                "line1"
                line2
                line3
                """;
        System.out.print(str);
        String textBlock = """
                line1: %s
                line2: %s
                line3""".formatted("Is Good","Is Better");
        System.out.print(textBlock);
    }
}

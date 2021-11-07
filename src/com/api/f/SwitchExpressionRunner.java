package com.api.f;

public class SwitchExpressionRunner {
    public static String findDayOfTheWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> {
                System.out.println("Do Some Complex Logic Here");
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> throw new IllegalArgumentException("Invalid Option" + day);
        };
        return dayOfTheWeek;
    }

    public static void main(String[] args) {
        System.out.println(findDayOfTheWeek(0));
    }
}

package com.api.enumeration;

public enum Color {
    RED("red"), GREEN("green"), BLUE("blue");
    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

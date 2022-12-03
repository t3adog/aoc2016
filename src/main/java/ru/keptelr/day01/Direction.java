package ru.keptelr.day01;

public enum Direction {
    right,
    left;

    static Direction fromString(String str) {
        if (str.equals("R")) {
            return right;
        }
        if (str.equals("L")) {
            return left;
        }
        throw new RuntimeException("Unknown direction");
    }
}

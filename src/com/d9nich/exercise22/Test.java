package com.d9nich.exercise22;

public class Test {
    public static void main(String[] args) {
        ComparableSquare comparableSquare1 = new ComparableSquare(5);
        ComparableSquare comparableSquare2 = new ComparableSquare(5);
        System.out.println(comparableSquare1.compareTo(comparableSquare2));
    }
}

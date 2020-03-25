package com.d9nich.exercise6;

import com.d9nich.exercise5.Rectangle;

public class Main {
    public static void main(String[] args) {
        ComparableCircle first = new ComparableCircle(3);
        ComparableCircle second = new ComparableCircle(4);
        Rectangle third = new Rectangle(4, 5);
        System.out.println(first.compareTo(second));
        System.out.println(first.compareTo(third));
    }
}

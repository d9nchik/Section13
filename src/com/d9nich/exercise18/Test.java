package com.d9nich.exercise18;

import com.d9nich.exercise15.Rational;

public class Test {
    public static void main(String[] args) {
        Rational total = new Rational();
        for (int i = 1; i < 100; i += 2)
            total = total.add(new Rational(i, i + 1));
        System.out.println(total);
    }
}

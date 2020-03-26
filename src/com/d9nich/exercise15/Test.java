package com.d9nich.exercise15;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first rational number: ");
        Rational rational1 = new Rational(input.nextLong(), input.nextLong());
        System.out.print("Enter the second rational number: ");
        Rational rational2 = new Rational(input.nextLong(), input.nextLong());
        System.out.println(rational1 + " + " + rational2 + " = " + rational1.add(rational2));
        System.out.println(rational1 + " - " + rational2 + " = " + rational1.subtract(rational2));
        System.out.println(rational1 + " * " + rational2 + " = " + rational1.multiply(rational2));
        System.out.println(rational1 + " / " + rational2 + " = " + rational1.divide(rational2));
        System.out.println(rational2 + " is " + rational2.doubleValue());
    }
}

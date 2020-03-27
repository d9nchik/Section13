package com.d9nich.exercise17;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex1 number: ");
        Complex complex1 = new Complex(input.nextDouble(), input.nextDouble());
        System.out.print("Enter the second complex2 number: ");
        Complex complex2 = new Complex(input.nextDouble(), input.nextDouble());
        System.out.println(complex1 + " + " + complex2 + " = " + complex1.add(complex2));
        System.out.println(complex1 + " - " + complex2 + " = " + complex1.subtract(complex2));
        System.out.println(complex1 + " * " + complex2 + " = " + complex1.multiply(complex2));
        System.out.println(complex1 + " / " + complex2 + " = " + complex1.divide(complex2));
        System.out.println(complex1 + " is " + complex1.doubleValue());
    }
}

package com.d9nich.exercise21;

import com.d9nich.exercise15.Rational;

import java.util.Scanner;

public class VertexEquationSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        Rational h = new Rational(-b, 2 * a);
        Rational k = new Rational(4 * a * c - b * b, 4 * a);
        System.out.println("h is " + h + " k is " + k);
    }
}

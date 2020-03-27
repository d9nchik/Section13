package com.d9nich.exercise20;

import com.d9nich.exercise17.Complex;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / 2 / a;
            double x2 = (-b - Math.sqrt(discriminant)) / 2 / a;
            System.out.println("The equation has two roots " + (int) (x1 * 1_000_000) / 1_000_000.0 +
                    " and " + (int) (x2 * 1_000_000) / 1_000_000.0);
        } else if (discriminant == 0) {
            double x = -b / 2 / a;
            System.out.println("The equation has one root " + (int) (x * 1_000_000) / 1_000_000.0);
        } else {
            Complex x1 = new Complex(-b / 2 / a, Math.sqrt(discriminant * (-1)) / 2 / a);
            Complex x2 = new Complex(x1.getRealPart(), -x1.getImaginaryPart());
            System.out.println("The equation has two roots: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}

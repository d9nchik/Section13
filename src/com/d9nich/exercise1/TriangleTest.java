package com.d9nich.exercise1;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side: ");
        Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.print("Enter color: ");
        triangle.setColor(input.next());
        System.out.print("Is filled: ");
        triangle.setFilled(input.next().charAt(0) == 't');
        System.out.println("Area = " + triangle.getArea());
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("Color = " + triangle.getColor());
        System.out.println("Is filled?: " + triangle.isFilled());
    }
}

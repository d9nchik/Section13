package com.d9nich.exercise5;


public class Main {
    public static void main(String[] args) {
        Circle first = new Circle(3);
        Circle second = new Circle(4);
        System.out.println(GeometricObject.max(second, first).getArea());
        Rectangle rectangle2 = new Rectangle(2, 3);
        Rectangle rectangle1 = new Rectangle(4, 5);
        System.out.println(GeometricObject.max(rectangle1, rectangle2).getArea());
    }
}

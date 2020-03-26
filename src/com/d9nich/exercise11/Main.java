package com.d9nich.exercise11;

public class Main {
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5);
        System.out.println("Area = " + octagon.getArea());
        System.out.println("Perimeter = " + octagon.getPerimeter());
        Octagon octagon1 = (Octagon) octagon.clone();
        System.out.println(octagon.compareTo(octagon1));
    }
}

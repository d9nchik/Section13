package com.d9nich.exercise12;

import com.d9nich.exercise5.Circle;
import com.d9nich.exercise5.GeometricObject;
import com.d9nich.exercise5.Rectangle;

public class Main {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = {new Rectangle(4, 5), new Rectangle(2, 3),
                new Circle(5), new Circle(1)};
        System.out.println(sumArea(geometricObjects));
    }

    public static double sumArea(GeometricObject[] a) {
        double totalArea = 0;
        for (GeometricObject geometricObject : a)
            totalArea += geometricObject.getArea();
        return totalArea;
    }
}

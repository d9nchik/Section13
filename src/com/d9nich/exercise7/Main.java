package com.d9nich.exercise7;

import com.d9nich.exercise5.GeometricObject;
import com.d9nich.exercise5.Rectangle;
import com.d9nich.exercise6.ComparableCircle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        Random random = new Random();
        for (int i = 0; i < objects.length; i++) {
            int choice = random.nextInt(3);
            switch (choice) {
                case 0:
                    objects[i] = new Square(random.nextInt(9) + 1);
                    break;
                case 1:
                    objects[i] = new ComparableCircle(random.nextInt(9) + 1);
                    break;
                case 2:
                    objects[i] = new Rectangle(random.nextInt(9) + 1, random.nextInt(9) + 1);
            }
        }
        for (GeometricObject object : objects) {
            System.out.println(object.getArea());
            if (object instanceof Colorable)
                ((Colorable) object).howToColor();
        }
    }
}

package com.d9nich.exercise6;

import com.d9nich.exercise5.Circle;
import com.d9nich.exercise5.GeometricObject;

public class ComparableCircle extends Circle {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (o instanceof ComparableCircle)
            return Double.compare(super.getRadius(), ((ComparableCircle) o).getRadius());
        return super.compareTo(o);
    }
}

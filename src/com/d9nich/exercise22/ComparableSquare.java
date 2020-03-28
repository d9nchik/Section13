package com.d9nich.exercise22;

import com.d9nich.exercise5.GeometricObject;
import com.d9nich.exercise7.Square;

public class ComparableSquare extends Square {
    public ComparableSquare(double side) {
        super(side);
    }

    public ComparableSquare() {
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (o instanceof Square)
            return Double.compare(getSide(), ((Square) o).getSide());
        return super.compareTo(o);
    }
}

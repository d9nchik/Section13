package com.d9nich.exercise11;

import com.d9nich.exercise5.GeometricObject;

public class Octagon extends GeometricObject implements Cloneable {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon() {
        this(0);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Octagon)
            return side == ((Octagon) o).side;
        return super.equals(o);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Clone not supported");
        }
        return null;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (o instanceof Octagon)
            return Double.compare(side, ((Octagon) o).side);
        return super.compareTo(o);
    }
}

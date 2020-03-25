package com.d9nich.exercise5;

import java.util.Objects;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public static GeometricObject max(GeometricObject first, GeometricObject second) {
        if (first.compareTo(second) > 0)
            return first;
        else
            return second;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getArea());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof GeometricObject)
            return getArea() == ((GeometricObject) o).getArea();
        return false;
    }
}

package com.d9nich.exercise17;

import java.util.Objects;

public class Complex extends Number implements Comparable<Complex>, Cloneable {
    private double a, b;


    public Complex() {
        this(0, 0);
    }

    public Complex(double a) {
        this(a, 0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Complex o) {
        return Double.compare(abs(), o.abs());
    }

    @Override
    public int intValue() {
        return (int) abs();
    }

    @Override
    public long longValue() {
        return (long) abs();
    }

    @Override
    public float floatValue() {
        return (float) abs();
    }

    @Override
    public double doubleValue() {
        return abs();
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex complex) {
        return new Complex(a + complex.a, b + complex.b);
    }

    public Complex subtract(Complex complex) {
        return new Complex(a - complex.a, b - complex.b);
    }

    public Complex multiply(Complex complex) {
        return new Complex((a * complex.a - b * complex.b),
                (b * complex.a + a * complex.b));
    }

    public Complex divide(Complex complex) {

        double down = complex.a * complex.a + complex.b * complex.b;
        return new Complex((a * complex.a + b * complex.b) / down,
                (b * complex.a - a * complex.b) / down);
    }

    @Override
    public String toString() {
        if (a == 0)
            return b + "i";
        if (b > 0)
            return "(" + a + " + " + ((int) (b * (10000))) / 10000.0 + "*i)";
        if (b == 0)
            return a + "";
        return "(" + a + " - " + ((int) (b * (-10000))) / 10000.0 + "*i)";
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Clone does`nt allowed");
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.a, a) == 0 &&
                Double.compare(complex.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

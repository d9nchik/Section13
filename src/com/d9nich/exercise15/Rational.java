package com.d9nich.exercise15;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger numerator;
    private BigInteger denominator;

    /**
     * Construct a rational with default properties
     */
    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        this(new BigInteger("" + numerator), new BigInteger("" + denominator));
    }

    /**
     * Construct a rational with specified numerator and denominator
     */
    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        this.numerator = (denominator.compareTo(new BigInteger("0")) > 0 ? new BigInteger("1") : new BigInteger("-1")).multiply(numerator).divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }


    /**
     * Return numerator
     */
    public BigInteger getNumerator() {
        return numerator;
    }

    /**
     * Return denominator
     */
    public BigInteger getDenominator() {
        return denominator;
    }

    /**
     * Add a rational number to this rational
     */
    public Rational add(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /**
     * Subtract a rational number from this rational
     */
    public Rational subtract(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /**
     * Multiply a rational number by this rational
     */
    public Rational multiply(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /**
     * Divide a rational number by this rational
     */
    public Rational divide(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.numerator);
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.compareTo(new BigInteger("1")) == 0)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        if (other instanceof Rational)
            return (this.subtract((Rational) (other))).getNumerator().compareTo(new BigInteger("0")) == 0;
        return false;
    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int) doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
        return new BigDecimal(numerator.toString()).divide(new BigDecimal(denominator.toString()), 20, RoundingMode.CEILING).doubleValue();
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational o) {
        return Integer.compare(this.subtract(o).getNumerator().compareTo(new BigInteger("0")), 0);
    }
}

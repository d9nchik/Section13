package com.d9nich.exercise19;

import com.d9nich.exercise15.Rational;

import java.math.BigInteger;
import java.util.Scanner;

public class ConvectorToFraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");

        String line = input.nextLine();
        if (!line.matches("-?\\d*[.,]\\d*")) {
            System.out.println("You should enter the format -1,09");
            System.exit(1);
        }
        String[] number = line.split("[.,]");

        Rational up = new Rational(new BigInteger(number[0]).abs(), new BigInteger("1"));
        Rational down = new Rational(new BigInteger(number[1]), new BigInteger("10").pow(number[1].length()));
        Rational rational = up.add(down);
        if (number[0].charAt(0) == '-')
            rational = rational.multiply(new Rational(-1, 1));
        System.out.println("The fraction number is " + rational);
    }
}

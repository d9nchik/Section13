package com.d9nich.exercise16;

import com.d9nich.exercise15.Rational;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 1 || !args[0].matches("\\d+/\\d+\\s*[-+*/]\\s*\\d+/\\d+")) {
            System.out.println(
                    "Usage: java Calculator \"operand1 operator operand2\"");
            System.exit(1);
        }

        String[] words = args[0].replaceAll("(\\d)(/)(\\d)", "$1 $3").split("\\s");
        Rational first = new Rational(Integer.parseInt(words[0]), Integer.parseInt(words[1]));
        Rational second = new Rational(Integer.parseInt(words[3]), Integer.parseInt(words[4]));
        System.out.print(args[0] + " = ");
        // Determine the operator
        switch (words[2].charAt(0)) {
            case '+':
                System.out.println(first.add(second));
                break;
            case '-':
                System.out.println(first.subtract(second));
                break;
            case '*':
                System.out.println(first.multiply(second));
                break;
            case '/':
                System.out.println(first.divide(second));
        }
    }
}

package com.d9nich.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void average(ArrayList<Integer> list) {
        int total = 0;
        for (Integer integer : list)
            total += integer;
        System.out.println("Average = " + total / list.size());
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numbers to finish enter: ");
        int number = input.nextInt();
        while (number != 0) {
            integers.add(number);
            number = input.nextInt();
        }
        average(integers);
    }
}

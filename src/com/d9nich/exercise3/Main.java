package com.d9nich.exercise3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextDouble() * 10);
        }
        sort(numbers);
        System.out.println(numbers);
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int k = i;
            String[] kNumber = list.get(k).toString().split("[,.]");
            for (int j = i + 1; j < list.size(); j++) {
                String[] jNumber = list.get(j).toString().split("[,.]");
                if (kNumber[0].length() > jNumber[0].length() || (kNumber[0].length() == jNumber[0].length() && ((kNumber[0].compareTo(jNumber[0])) > 0 ||
                        (kNumber[0].equals(jNumber[0]) && (kNumber[1].compareTo(jNumber[1])) > 0)))) {
                    k = j;
                    kNumber = jNumber;
                }
            }
            Number temp = list.get(k);
            list.set(k, list.get(i));
            list.set(i, temp);
        }
    }
}

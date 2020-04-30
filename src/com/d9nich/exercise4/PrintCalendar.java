package com.d9nich.exercise4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCalendar {
    public static void main(String[] args) {
        if (args.length > 2) {
            System.out.println("Usage PrintCalendar month year");
            System.exit(1);
        }
        if (args.length == 2)
            printMonth(Integer.parseInt(args[1]), Integer.parseInt(args[0]));
        else if (args.length == 1)
            printMonth(new GregorianCalendar().get(Calendar.YEAR), Integer.parseInt(args[0]));
        else
            printMonth(new GregorianCalendar().get(Calendar.YEAR), new GregorianCalendar().get(Calendar.MONTH) + 1);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        System.out.println("\t\t" + monthNames[month - 1]
                + " " + year);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year, int month) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(Calendar.MONTH, month - 1);
        gregorianCalendar.set(Calendar.YEAR, year);
        gregorianCalendar.set(Calendar.DATE, 1);
        int startDay = gregorianCalendar.get(Calendar.DAY_OF_WEEK) - 1;

        int numberOfDaysInMonth = gregorianCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);


        for (int i = 0; i < startDay; i++)
            System.out.print("    ");

        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }
}

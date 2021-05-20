package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("false : " + NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println("true : " + NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println("false : " + NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println("true : " + NumberOfDaysInMonth.isLeapYear(2000)+ "\n") ;

        System.out.println("January has " + NumberOfDaysInMonth.getDaysInMonth(1,2020) + " days.");
        System.out.println("February has " + NumberOfDaysInMonth.getDaysInMonth(2,2020) + " days.");
        System.out.println("February has " + NumberOfDaysInMonth.getDaysInMonth(2,2018) + " days.");
        System.out.println("January has " + NumberOfDaysInMonth.getDaysInMonth(-1,2020) + " days.");




    }
}

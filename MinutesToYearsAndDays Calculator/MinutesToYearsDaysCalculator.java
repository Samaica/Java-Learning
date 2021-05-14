package com.company;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long hours = minutes / 60; // 8760 hours = 1 year

            long days = hours / 24; // 1440 minutes
            long years = days / 365; // 525,600 minutes = 1 year

            // long calculatedYears = minutes / years;
            long remainingMinutes = (minutes - (years * 525600));
            long remainingDays = (remainingMinutes / 1440);



            System.out.println(minutes + " min = " +
                    years + " y and " +
                    remainingDays + " d");
        }
    }
}

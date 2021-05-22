package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " +
                calculateInterest(10000.0, 2.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println("******************************************************************");
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("******************************************************************");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("******************************************************************");

        int count = 0;
        for (int i = 23; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a Prime number");
                count++;
                if (count == 3) {
                    System.out.println("Exiting for loop.");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
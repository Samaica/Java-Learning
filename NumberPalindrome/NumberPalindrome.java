package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int numberTest = number;
        System.out.println("The number is: " + number);

        int reverse = 0;

        System.out.println("reverse = " + reverse);

        while (numberTest != 0) {
            int lastDigit = numberTest % 10;
            System.out.println("The last digit is: " + lastDigit);
            reverse = reverse * 10;
            System.out.println("reverse * 10 = " + reverse);
            reverse = reverse + lastDigit;
            System.out.println("reverse + lastDigit = " + reverse);
            numberTest = numberTest / 10;
            System.out.println(numberTest + "\n");
        }

        return number == reverse;

    }
}

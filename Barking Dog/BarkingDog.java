package com.company;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        barking = true;

        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            barking = false;
            return false;
        }

        else if (barking && ((hourOfDay < 8) || (hourOfDay > 22))) {
            return true;
        }

        else {
            return false;
        }
    }
}

package com.company;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        //1 MB = 1024 KB
        int megabytes = (kiloBytes / 1024);
        int remainder = (kiloBytes % 1024);

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
        System.out.println(kiloBytes + " KB = " +
                megabytes + " MB and " + (remainder) + " KB");
        }
    }
}

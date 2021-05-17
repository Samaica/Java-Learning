package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("false : " + PlayingCat.isCatPlaying(true, 10));
        System.out.println("false : " + PlayingCat.isCatPlaying(false, 36));
        System.out.println("true : " + PlayingCat.isCatPlaying(false, 35));


    }
}

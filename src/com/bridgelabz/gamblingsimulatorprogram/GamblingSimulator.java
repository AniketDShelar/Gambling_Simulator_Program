package com.bridgelabz.gamblingsimulatorprogram;

public class GamblingSimulator {
    static int stake = 100;
    final static int dailyBet = 1;
    public static void gambler() {
            int result = (int) Math.floor(Math.random() * 10 % 2);
            if (dailyBet == result) {
                System.out.println("Winner");
                stake = stake + 50;
                System.out.println("stake after winning today : $" +stake);
            } else {
                System.out.println("loser");
                stake = stake - 50;
                System.out.println("stake after losing today : $" +stake);
            }
        }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator Program");
        gambler();
    }
}

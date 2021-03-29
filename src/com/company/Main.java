package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);
        calculateScore(true, 10000,8,200);

        int highScorePosition = calculateScorePosition(1500);
        displayHighScorePosition("Dima", highScorePosition);

        highScorePosition = calculateScorePosition(900);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateScorePosition(400);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateScorePosition(50);
        displayHighScorePosition("Jack", highScorePosition);

        long myLong = toMilesPerHour(10.25);
        System.out.println(myLong);
        printConversion(95.75);

        printMegaBytesAndKiloBytes(2500);

        shouldWakeUp(false, 24);
        System.out.println("");

        areEqualByThreeDecimalPlaces(3.0, -3.0);




    }

    public static int calculateScore (boolean gameOver, int score, int levelComplete, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition (String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table");
    }
    public static int calculateScorePosition (int score) {
       /* if ( score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        } */

        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1L;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int kiloBytesRemainder = kiloBytes % 1024;
            int megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes +
                    " MB and " + kiloBytesRemainder + " KB");
        }
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (barking && (hourOfDay < 0 || hourOfDay > 23)) {
            System.out.println("False");
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    // LEAP YEAR IS NOT SOLVED

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        firstNumber = (int)(firstNumber * 1000);
        System.out.println(firstNumber);

        secondNumber = (int)(secondNumber * 1000);
        System.out.println(secondNumber);

        if (firstNumber == secondNumber) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public static boolean hasEqualSum (int first, int second, int third) {
        if (first + second == third) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen (int first, int second, int third) {
        if ((first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19)) {
            return true;
        } return false;
    }

    public static boolean isTeen (int age) {
        if (age >= 13 && age <= 19) {
            return true;
        } return false;
    }

}

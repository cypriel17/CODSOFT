package org.codSoft.numberGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        System.out.println("----Welcome to guess the number!----");
        runGame();
    }

    public static void runGame(){

        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(100)+1;
        int attempts = 8;

        System.out.println("You have " + attempts + " to win the game!");

        while (attempts != 0) {
            System.out.println("\nGuess a number between the range (1-100): ");

            try {
                int guess = userInput.nextInt();
                if (guess == answer)
                    break;
                else {
                    attempts--;
                    incorrectGuess(attempts, answer, guess);
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number e.g 5");
                userInput.nextLine();
            }

        }
        gameResults(attempts, answer);
    }

    public static void gameResults(int attempts, int answer) {

        if (attempts == 0) {
            System.out.println("\nSorry! You Lost.");
            System.out.println("\nThe number was: " + answer);
        }

        else {
            System.out.println("You Win!");
            System.out.println("Congratulations! Einstein Got Nothing On You.");
        }
    }

    public static void incorrectGuess(int attempts, int answer, int guess) {

        if (guess > answer) {
            System.out.println("Too high! Your number is lower.\nGuess Again.");
            System.out.printf("\nYou have %d attempts left!", attempts);
        } else {
            System.out.println("Too low! Your number is higher.\nGuess Again.");
            System.out.printf("\nYou have %d attempts left!", attempts);
        }
    }

}

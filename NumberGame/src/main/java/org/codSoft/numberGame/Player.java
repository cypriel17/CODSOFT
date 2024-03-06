package org.codSoft.numberGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    private final Scanner input;

    public Player() {
        this.input = new Scanner(System.in);
    }

    public String getGuess() {
        String guess = "";

        while (guess.isBlank()) {
            System.out.print("\nEnter your guess: ");

            try {
                guess = input.nextLine();

                if (guess.matches(".*\\d+.*")) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine();
            }
        }
        return guess;
    }

    public static void incorrectGuess(int attempts, int answer, int guess) {
        if (guess > answer) {
            System.out.println("Too high! Your number is lower.\nGuess Again.");
        } else {
            System.out.println("Too low! Your number is higher.\nGuess Again.");
        }

        System.out.print("You have " + attempts + " attempts left!\n");
    }

    public static void gameResults(int attempts, int answer) {
        if (attempts == 0) {
            System.out.println("\nSorry! You Lost.");
            System.out.println("The correct number was: " + answer);
        } else {
            System.out.print("You Win! Congratulations! Einstein Got Nothing On You!\n");
        }
    }
}
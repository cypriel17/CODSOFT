package org.codSoft.numberGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        int rounds = 3;
        int attempts = 5;

        for (int round = 1; round <= rounds; round++) {
            runGame(round, rounds, attempts);
        }
    }

    public static void runGame(int round, int rounds, int attempts) {
        int answer = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);

        System.out.println("Round " + round + ": You have " + attempts + " attempts and " + (rounds - round + 1) + " rounds to win the game!");
        int guess = -1;

        while (guess != answer && attempts > 0) {
            System.out.print("\nEnter your guess: ");

            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
                continue;
            }

            if (guess == answer) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else {
                attempts--;
                incorrectGuess(attempts, answer, guess);
            }
        }

        gameResults(attempts, answer);
    }

    public static void incorrectGuess(int attempts, int answer, int guess) {
        if (guess > answer) {
            System.out.println("Too high! Your number is lower.\nGuess Again.");
        } else {
            System.out.println("Too low! Your number is higher.\nGuess Again.");
        }

        System.out.println("You have " + attempts + " attempts left!");
    }

    public static void gameResults(int attempts, int answer) {
        if (attempts == 0) {
            System.out.println("\nSorry! You Lost.");
            System.out.println("The correct number was: " + answer);
        } else {
            System.out.println("You Win!\nCongratulations! Einstein Got Nothing On You.\n");
        }
    }
}

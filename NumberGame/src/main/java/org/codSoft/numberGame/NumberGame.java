package org.codSoft.numberGame;

import java.util.Scanner;

public class NumberGame {
    private int answer;
    private int chances;
    private NumberGenerator generator;
    private Player player;

    public NumberGame(NumberGenerator generator) {
        this.generator = generator;
        this.answer = Integer.parseInt(generator.numGenerator());
        this.chances = 5;
        this.player = new Player();
    }

    public static void main(String[] args) {

        System.out.println("Welcome To The Number Game!");
        NumberGame numberGame = new NumberGame(new NumberGenerator());
        numberGame.playGame();
    }

    private void playGame() {

        System.out.println("Enter A Number Between 1 and 100!\n" +
                "You Have 5 Attempts To Win The Game.");
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            while (chances > 0) {
                try {
                    int guess = Integer.parseInt(player.getGuess());

                    if (guess == answer) {
                        Player.gameResults(chances, answer);
                        break;
                    } else if (guess > answer) {
                        this.chances--;
                        Player.incorrectGuess(chances, answer,guess);
                    } else {
                        this.chances--;
                        Player.incorrectGuess(chances, answer,guess);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }

            System.out.print("Would you like to play again (y/n)? ");

            playAgain = scanner.nextLine();
            resetGame(generator);

        } while (playAgain.equalsIgnoreCase("y"));

    }
    public void resetGame(NumberGenerator generator) {
        this.generator = generator;
        this.answer = Integer.parseInt(generator.numGenerator());
        this.chances = 5;
        this.player = new Player();
    }
}

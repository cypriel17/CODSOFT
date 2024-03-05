package org.codSoft.numberGame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberGameTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void test_GameResultsWin() {
        NumberGame.gameResults(5, 42);
        assertEquals("You Win!\nCongratulations! Einstein Got Nothing On You.\n", outputStream.toString());
    }

    @Test
    public void test_GameResultsLose() {
        NumberGame.gameResults(0, 42);
        assertEquals("\nSorry! You Lost.\n\nThe correct number was: 42\n", outputStream.toString());
    }

    @Test
    public void test_IncorrectGuessHigh() {
        NumberGame.incorrectGuess(3, 42, 50);
        assertEquals("Too high! Your number is lower.\nGuess Again.\nYou have 3 attempts left!\n", outputStream.toString());
    }

    @Test
    public void test_IncorrectGuessLow() {
        NumberGame.incorrectGuess(2, 42, 30);
        assertEquals("Too low! Your number is higher.\nGuess Again.\nYou have 2 attempts left!\n", outputStream.toString());
    }

    @Test
    public void test_RunGameWin() {
        provideUserInput("42");
        NumberGame.main(new String[]{});
        assertEquals("Congratulations! You guessed the correct number.\n", outputStream.toString().replaceAll("\n", ""));
    }

    @Test
    public void test_RunGameLose() {
        provideUserInput("1\n2\n3\n4\n5\n6\n7\n8\n");
        NumberGame.main(new String[]{});
        assertEquals("Sorry! You Lost.\nThe correct number was:", outputStream.toString().substring(0, 39));
    }

    private void provideUserInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
}

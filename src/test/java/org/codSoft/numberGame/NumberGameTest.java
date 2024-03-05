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
    public void test_IncorrectGuessHigh() {
        Player.incorrectGuess(3, 42, 50);
        assertEquals("Too high! Your number is lower.\nGuess Again.\nYou have 3 attempts left!\n", outputStream.toString());
    }

    @Test
    public void test_IncorrectGuessLow() {
        Player.incorrectGuess(2, 42, 30);
        assertEquals("Too low! Your number is higher.\nGuess Again.\nYou have 2 attempts left!\n", outputStream.toString());
    }

    @Test
    public void test_RunGameWin() {
        provideUserInput("42");
        Player.gameResults(5, 42);
        assertEquals("You Win! Congratulations! Einstein Got Nothing On You.\n", outputStream.toString());
    }

    @Test
    public void test_RunGameLost() {
        provideUserInput("1\n2\n3\n4\n5\n");
        Player.gameResults(0, 42);
        assertEquals("\nSorry! You Lost.\nThe correct number was: 42", outputStream.toString().substring(0, 39));
    }

    private void provideUserInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
}

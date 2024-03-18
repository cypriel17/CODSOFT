package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.History;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HistoryTest {

    @Test
    public void test_History_correctArgs(){
        String name = "History";
        String argument = String.valueOf(67);
        History history = new History(name, argument);

        assertEquals(name.toLowerCase(), history.getName());
        assertEquals(argument, history.getArgument());
    }

    @Test
    public void test_History_incorrectArgs(){
        String name = "History";
        String argument = String.valueOf(67);
        History history = new History(name, argument);

        assertEquals(name.toLowerCase(), history.getName());
        assertNotEquals("6t", history.getArgument());
    }

}
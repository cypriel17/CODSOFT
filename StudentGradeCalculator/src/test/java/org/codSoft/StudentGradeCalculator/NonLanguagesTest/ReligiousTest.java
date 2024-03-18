package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.Religious;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReligiousTest {

    @Test
    public void test_Religious_correctArgs(){
        String name = "Religious";
        String argument = String.valueOf(67);
        Religious religious = new Religious(name, argument);

        assertEquals(name.toLowerCase(), religious.getName());
        assertEquals(argument, religious.getArgument());
    }

    @Test
    public void test_Religious_incorrectArgs(){
        String name = "Religious";
        String argument = String.valueOf(67);
        Religious religious = new Religious(name, argument);

        assertEquals(name.toLowerCase(), religious.getName());
        assertNotEquals("6t", religious.getArgument());
    }

}
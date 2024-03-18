package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.Economics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EconomicsTest {

    @Test
    public void test_Economics_correctArgs(){
        String name = "Economics";
        String argument = String.valueOf(67);
        Economics economics = new Economics(name, argument);

        assertEquals(name.toLowerCase(), economics.getName());
        assertEquals(argument, economics.getArgument());
    }

    @Test
    public void test_Economics_incorrectArgs(){
        String name = "Economics";
        String argument = String.valueOf(67);
        Economics economics = new Economics(name, argument);

        assertEquals(name.toLowerCase(), economics.getName());
        assertNotEquals("6t", economics.getArgument());
    }

}
package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.Tourism;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TourismTest {

    @Test
    public void test_Tourism_correctArgs(){
        String name = "Tourism";
        String argument = String.valueOf(67);
        Tourism tourism = new Tourism(name, argument);

        assertEquals(name.toLowerCase(), tourism.getName());
        assertEquals(argument, tourism.getArgument());
    }

    @Test
    public void test_Tourism_incorrectArgs(){
        String name = "Tourism";
        String argument = String.valueOf(67);
        Tourism tourism = new Tourism(name, argument);

        assertEquals(name.toLowerCase(), tourism.getName());
        assertNotEquals("6t", tourism.getArgument());
    }

}
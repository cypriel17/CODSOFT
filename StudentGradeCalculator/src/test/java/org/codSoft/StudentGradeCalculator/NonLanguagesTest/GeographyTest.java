package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.Geography;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeographyTest {

    @Test
    public void test_Geography_correctArgs(){
        String name = "Geography";
        String argument = String.valueOf(67);
        Geography geo = new Geography(name, argument);

        assertEquals(name.toLowerCase(), geo.getName());
        assertEquals(argument, geo.getArgument());
    }

    @Test
    public void test_Geography_incorrectArgs(){
        String name = "Geography";
        String argument = String.valueOf(67);
        Geography geo = new Geography(name, argument);

        assertEquals(name.toLowerCase(), geo.getName());
        assertNotEquals("6t", geo.getArgument());
    }

}
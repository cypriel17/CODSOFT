package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.LifeOrientation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeOrientationTest {

    @Test
    public void test_LO_correctArgs(){
        String name = "lo";
        String argument = String.valueOf(67);
        LifeOrientation lo = new LifeOrientation(name, argument);

        assertEquals(name.toLowerCase(), lo.getName());
        assertEquals(argument, lo.getArgument());
    }

    @Test
    public void test_LO_incorrectArgs(){
        String name = "lo";
        String argument = String.valueOf(67);
        LifeOrientation lo = new LifeOrientation(name, argument);

        assertEquals(name.toLowerCase(), lo.getName());
        assertNotEquals("6t", lo.getArgument());
    }

}
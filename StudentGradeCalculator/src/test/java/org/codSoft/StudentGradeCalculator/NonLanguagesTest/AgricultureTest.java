package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.Agriculture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgricultureTest {

    @Test
    public void test_Agriculture_correctArgs(){
        String name = "Agriculture";
        String argument = String.valueOf(67);
        Agriculture agric = new Agriculture(name, argument);

        assertEquals(name.toLowerCase(), agric.getName());
        assertEquals(argument, agric.getArgument());
    }

    @Test
    public void test_Agriculture_incorrectArgs(){
        String name = "Agriculture";
        String argument = String.valueOf(67);
        Agriculture agric = new Agriculture(name, argument);

        assertEquals(name.toLowerCase(), agric.getName());
        assertNotEquals("6t", agric.getArgument());
    }

}
package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.LifeSciences;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeSciencesTest {

    @Test
    public void test_LifeScience_correctArgs(){
        String name = "LifeSciences";
        String argument = String.valueOf(67);
        LifeSciences ls = new LifeSciences(name, argument);

        assertEquals(name.toLowerCase(), ls.getName());
        assertEquals(argument, ls.getArgument());
    }

    @Test
    public void test_LifeScience_incorrectArgs(){
        String name = "LifeSciences";
        String argument = String.valueOf(67);
        LifeSciences ls = new LifeSciences(name, argument);

        assertEquals(name.toLowerCase(), ls.getName());
        assertNotEquals("6t", ls.getArgument());
    }

}
package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.Sesotho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SesothoTest {

    @Test
    public void test_Sesotho_correctArgs(){
        String name = "Sesotho";
        String argument = String.valueOf(67);
        Sesotho sesotho = new Sesotho(name, argument);

        assertEquals(name.toLowerCase(), sesotho.getName());
        assertEquals(argument, sesotho.getArgument());
    }

    @Test
    public void test_Sesotho_incorrectArgs(){
        String name = "Sesotho";
        String argument = String.valueOf(67);
        Sesotho sesotho = new Sesotho(name, argument);

        assertEquals(name.toLowerCase(), sesotho.getName());
        assertNotEquals("6t", sesotho.getArgument());
    }

}
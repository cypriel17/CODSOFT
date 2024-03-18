package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.Afrikaans;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfrikaansTest {

    @Test
    public void test_Afrikaans_correctArgs(){
        String name = "Afrikaans";
        String argument = String.valueOf(67);
        Afrikaans afrikaans = new Afrikaans(name, argument);

        assertEquals(name.toLowerCase(), afrikaans.getName());
        assertEquals(argument, afrikaans.getArgument());
    }

    @Test
    public void test_Afrikaans_incorrectArgs(){
        String name = "Afrikaans";
        String argument = String.valueOf(67);
        Afrikaans afrikaans = new Afrikaans(name, argument);

        assertEquals(name.toLowerCase(), afrikaans.getName());
        assertNotEquals("6t", afrikaans.getArgument());
    }

}
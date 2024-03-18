package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.Afrikaans;
import org.codSoft.StudentGradeCalculator.NonLanguages.CAT;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CATTest {

    @Test
    public void test_CAT_correctArgs(){
        String name = "CAT";
        String argument = String.valueOf(67);
        CAT cat = new CAT(name, argument);

        assertEquals(name.toLowerCase(), cat.getName());
        assertEquals(argument, cat.getArgument());
    }

    @Test
    public void test_CAT_incorrectArgs(){
        String name = "CAT";
        String argument = String.valueOf(67);
        CAT cat = new CAT(name, argument);

        assertEquals(name.toLowerCase(), cat.getName());
        assertNotEquals("6t", cat.getArgument());
    }

}
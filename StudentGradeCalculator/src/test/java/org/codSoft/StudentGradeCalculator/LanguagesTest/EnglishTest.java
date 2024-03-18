package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.English;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnglishTest {

    @Test
    public void test_English_correctArgs(){
        String name = "English";
        String argument = String.valueOf(67);
        English english = new English(name, argument);

        assertEquals(name.toLowerCase(), english.getName());
        assertEquals(argument, english.getArgument());
    }

    @Test
    public void test_English_incorrectArgs(){
        String name = "English";
        String argument = String.valueOf(67);
        English english = new English(name, argument);

        assertEquals(name.toLowerCase(), english.getName());
        assertNotEquals("6t", english.getArgument());
    }

}
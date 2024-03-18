package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.Xitsonga;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XitsongaTest {

    @Test
    public void test_Xitsonga_correctArgs(){
        String name = "Xitsonga";
        String argument = String.valueOf(67);
        Xitsonga xitsonga = new Xitsonga(name, argument);

        assertEquals(name.toLowerCase(), xitsonga.getName());
        assertEquals(argument, xitsonga.getArgument());
    }

    @Test
    public void test_Xitsonga_incorrectArgs(){
        String name = "Xitsonga";
        String argument = String.valueOf(67);
        Xitsonga xitsonga = new Xitsonga(name, argument);

        assertEquals(name.toLowerCase(), xitsonga.getName());
        assertNotEquals("6t", xitsonga.getArgument());
    }

}
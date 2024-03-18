package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.Sepedi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SepediTest {

    @Test
    public void test_Sepedi_correctArgs(){
        String name = "Sepedi";
        String argument = String.valueOf(67);
        Sepedi sepedi = new Sepedi(name, argument);

        assertEquals(name.toLowerCase(), sepedi.getName());
        assertEquals(argument, sepedi.getArgument());
    }

    @Test
    public void test_Sepedi_incorrectArgs(){
        String name = "Sepedi";
        String argument = String.valueOf(67);
        Sepedi sepedi = new Sepedi(name, argument);

        assertEquals(name.toLowerCase(), sepedi.getName());
        assertNotEquals("6t", sepedi.getArgument());
    }

}
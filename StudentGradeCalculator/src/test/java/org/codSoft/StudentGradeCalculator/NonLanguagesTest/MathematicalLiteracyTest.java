package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.MathematicalLiteracy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicalLiteracyTest {

    @Test
    public void test_MathsLit_correctArgs(){
        String name = "mathslit";
        String argument = String.valueOf(67);
        MathematicalLiteracy mathLit = new MathematicalLiteracy(name, argument);

        assertEquals(name.toLowerCase(), mathLit.getName());
        assertEquals(argument, mathLit.getArgument());
    }

    @Test
    public void test_MathsLit_incorrectArgs(){
        String name = "mathslit";
        String argument = String.valueOf(67);
        MathematicalLiteracy mathLit = new MathematicalLiteracy(name, argument);

        assertEquals(name.toLowerCase(), mathLit.getName());
        assertNotEquals("6t", mathLit.getArgument());
    }

}
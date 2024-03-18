package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.IsiXhosa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsiXhosaTest {

    @Test
    public void test_IsiXhosa_correctArgs(){
        String name = "IsiXhosa";
        String argument = String.valueOf(67);
        IsiXhosa isixhosa = new IsiXhosa(name, argument);

        assertEquals(name.toLowerCase(), isixhosa.getName());
        assertEquals(argument, isixhosa.getArgument());
    }

    @Test
    public void test_IsiXhosa_incorrectArgs(){
        String name = "IsiXhosa";
        String argument = String.valueOf(67);
        IsiXhosa isixhosa = new IsiXhosa(name, argument);

        assertEquals(name.toLowerCase(), isixhosa.getName());
        assertNotEquals("6t", isixhosa.getArgument());
    }

}
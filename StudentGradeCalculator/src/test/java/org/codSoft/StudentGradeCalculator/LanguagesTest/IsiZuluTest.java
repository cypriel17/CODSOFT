package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.IsiZulu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsiZuluTest {

    @Test
    public void test_IsiZulu_correctArgs(){
        String name = "IsiZulu";
        String argument = String.valueOf(67);
        IsiZulu isizulu = new IsiZulu(name, argument);

        assertEquals(name.toLowerCase(), isizulu.getName());
        assertEquals(argument, isizulu.getArgument());
    }

    @Test
    public void test_IsiZulu_incorrectArgs(){
        String name = "IsiZulu";
        String argument = String.valueOf(67);
        IsiZulu isizulu = new IsiZulu(name, argument);

        assertEquals(name.toLowerCase(), isizulu.getName());
        assertNotEquals("6t", isizulu.getArgument());
    }

}
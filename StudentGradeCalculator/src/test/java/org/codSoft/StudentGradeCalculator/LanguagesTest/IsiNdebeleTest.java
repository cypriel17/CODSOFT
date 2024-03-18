package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.IsiNdebele;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsiNdebeleTest {

    @Test
    public void test_IsiNdebele_correctArgs(){
        String name = "IsiNdebele";
        String argument = String.valueOf(67);
        IsiNdebele isindebele = new IsiNdebele(name, argument);

        assertEquals(name.toLowerCase(), isindebele.getName());
        assertEquals(argument, isindebele.getArgument());
    }

    @Test
    public void test_IsiNdebele_incorrectArgs(){
        String name = "IsiNdebele";
        String argument = String.valueOf(67);
        IsiNdebele isindebele = new IsiNdebele(name, argument);

        assertEquals(name.toLowerCase(), isindebele.getName());
        assertNotEquals("6t", isindebele.getArgument());
    }

}
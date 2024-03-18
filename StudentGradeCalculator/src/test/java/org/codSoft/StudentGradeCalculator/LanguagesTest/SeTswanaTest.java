package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.SeTswana;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeTswanaTest {

    @Test
    public void test_SeTswana_correctArgs(){
        String name = "SeTswana";
        String argument = String.valueOf(67);
        SeTswana setswana = new SeTswana(name, argument);

        assertEquals(name.toLowerCase(), setswana.getName());
        assertEquals(argument, setswana.getArgument());
    }

    @Test
    public void test_SeTswana_incorrectArgs(){
        String name = "SeTswana";
        String argument = String.valueOf(67);
        SeTswana setswana = new SeTswana(name, argument);

        assertEquals(name.toLowerCase(), setswana.getName());
        assertNotEquals("6t", setswana.getArgument());
    }

}
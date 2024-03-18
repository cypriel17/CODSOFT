package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.SiSwati;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SiSwatiTest {

    @Test
    public void test_SiSwati_correctArgs(){
        String name = "SiSwati";
        String argument = String.valueOf(67);
        SiSwati siswati = new SiSwati(name, argument);

        assertEquals(name.toLowerCase(), siswati.getName());
        assertEquals(argument, siswati.getArgument());
    }

    @Test
    public void test_SiSwati_incorrectArgs(){
        String name = "SiSwati";
        String argument = String.valueOf(67);
        SiSwati siswati = new SiSwati(name, argument);

        assertEquals(name.toLowerCase(), siswati.getName());
        assertNotEquals("6t", siswati.getArgument());
    }

}
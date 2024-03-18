package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.BusinessStudies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessStudiesTest {

    @Test
    public void test_Business_correctArgs(){
        String name = "Business studies";
        String argument = String.valueOf(67);
        BusinessStudies business = new BusinessStudies(name, argument);

        assertEquals(name.toLowerCase(), business.getName());
        assertEquals(argument, business.getArgument());
    }

    @Test
    public void test_Afrikaans_incorrectArgs(){
        String name = "Business studies";
        String argument = String.valueOf(67);
        BusinessStudies business = new BusinessStudies(name, argument);

        assertEquals(name.toLowerCase(), business.getName());
        assertNotEquals("6t", business.getArgument());
    }
}
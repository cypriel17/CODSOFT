package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.Accounting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountingTest {

    @Test
    public void test_Accounting_correctArgs(){
        String name = "Accounting";
        String argument = String.valueOf(67);
        Accounting accounting = new Accounting(name, argument);

        assertEquals(name.toLowerCase(), accounting.getName());
        assertEquals(argument, accounting.getArgument());
    }

    @Test
    public void test_Accounting_incorrectArgs(){
        String name = "Accounting";
        String argument = String.valueOf(67);
        Accounting accounting = new Accounting(name, argument);

        assertEquals(name.toLowerCase(), accounting.getName());
        assertNotEquals("6t", accounting.getArgument());
    }

}
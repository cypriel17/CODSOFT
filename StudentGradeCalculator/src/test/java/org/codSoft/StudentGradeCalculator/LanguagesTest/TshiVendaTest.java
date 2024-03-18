package org.codSoft.StudentGradeCalculator.LanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.TshiVenda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TshiVendaTest {

    @Test
    public void test_TshiVenda_correctArgs(){
        String name = "TshiVenda";
        String argument = String.valueOf(67);
        TshiVenda tshivenda = new TshiVenda(name, argument);

        assertEquals(name.toLowerCase(), tshivenda.getName());
        assertEquals(argument, tshivenda.getArgument());
    }

    @Test
    public void test_TshiVenda_incorrectArgs(){
        String name = "TshiVenda";
        String argument = String.valueOf(67);
        TshiVenda tshivenda = new TshiVenda(name, argument);

        assertEquals(name.toLowerCase(), tshivenda.getName());
        assertNotEquals("6t", tshivenda.getArgument());
    }

}
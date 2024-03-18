package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.Mathematics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicsTest {

    @Test
    public void test_Mathematics_correctArgs(){
        String name = "Mathematics";
        String argument = String.valueOf(67);
        Mathematics maths = new Mathematics(name, argument);

        assertEquals(name.toLowerCase(), maths.getName());
        assertEquals(argument, maths.getArgument());
    }

    @Test
    public void test_Mathematics_incorrectArgs(){
        String name = "Mathematics";
        String argument = String.valueOf(67);
        Mathematics maths = new Mathematics(name, argument);

        assertEquals(name.toLowerCase(), maths.getName());
        assertNotEquals("6t", maths.getArgument());
    }

}
package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.Physics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhysicsTest {

    @Test
    public void test_Physics_correctArgs(){
        String name = "Physics";
        String argument = String.valueOf(67);
        Physics physics = new Physics(name, argument);

        assertEquals(name.toLowerCase(), physics.getName());
        assertEquals(argument, physics.getArgument());
    }

    @Test
    public void test_Physics_incorrectArgs(){
        String name = "Physics";
        String argument = String.valueOf(67);
        Physics physics = new Physics(name, argument);

        assertEquals(name.toLowerCase(), physics.getName());
        assertNotEquals("6t", physics.getArgument());
    }

}
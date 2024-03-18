package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.Languages.Afrikaans;
import org.codSoft.StudentGradeCalculator.NonLanguages.Consumer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsumerTest {

    @Test
    public void test_Consumer_correctArgs(){
        String name = "Consumer";
        String argument = String.valueOf(67);
        Consumer consumer = new Consumer(name, argument);

        assertEquals(name.toLowerCase(), consumer.getName());
        assertEquals(argument, consumer.getArgument());
    }

    @Test
    public void test_Consumer_incorrectArgs(){
        String name = "Consumer";
        String argument = String.valueOf(67);
        Consumer consumer = new Consumer(name, argument);

        assertEquals(name.toLowerCase(), consumer.getName());
        assertNotEquals("6t", consumer.getArgument());
    }

}
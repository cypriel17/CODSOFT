package org.codSoft.StudentGradeCalculator.NonLanguagesTest;

import org.codSoft.StudentGradeCalculator.NonLanguages.Music;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicTest {

    @Test
    public void test_Music_correctArgs(){
        String name = "Music";
        String argument = String.valueOf(67);
        Music music = new Music(name, argument);

        assertEquals(name.toLowerCase(), music.getName());
        assertEquals(argument, music.getArgument());
    }

    @Test
    public void test_Music_incorrectArgs(){
        String name = "Music";
        String argument = String.valueOf(67);
        Music music = new Music(name, argument);

        assertEquals(name.toLowerCase(), music.getName());
        assertNotEquals("6t", music.getArgument());
    }
}
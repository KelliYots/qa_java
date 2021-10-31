package com.example;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class CatGetSoundTest {

    @Mock
    Feline testFeline;

    @Test
    public void catGetSoundTest() {
        Cat testCat = new Cat(testFeline);
        String actualSound = testCat.getSound();
        assertEquals("Мяу", actualSound);
    }
}
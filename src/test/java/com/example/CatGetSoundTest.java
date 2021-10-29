package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatGetSoundTest {
    Cat testCat = new Cat(new Feline());

    @Test
    public void catGetSoundTest() {
        String actualSound = testCat.getSound();
        assertEquals("Мяу", actualSound);
    }
}
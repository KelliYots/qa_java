package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatGetSoundTest {
    Cat cat = new Cat(new Feline());

    @Test
    public void catGetSoundTest() {
        String actualSound = cat.getSound();
        assertEquals("Мяу", actualSound);
    }
}
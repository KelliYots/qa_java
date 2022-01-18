package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetFamilyTest {
    Feline testFeline = new Feline();

    @Test
    public void felineGetFamilyTest() {
        String actualFamily = testFeline.getFamily();
        assertEquals("Кошачьи", actualFamily);
    }
}
package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FelineGetFamilyTest {
    Feline feline = new Feline();

    @Test
    public void felineGetFamilyTest() {
        String actualFamily = feline.getFamily();
        assertEquals("Кошачьи", actualFamily);
    }
}
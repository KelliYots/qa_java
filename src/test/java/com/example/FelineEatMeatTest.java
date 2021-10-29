package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineEatMeatTest {

    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        List<String> actualList = feline.eatMeat();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }
}
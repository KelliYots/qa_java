package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineEatMeatTest {

    Feline testFeline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        List<String> actualList = testFeline.eatMeat();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }
}
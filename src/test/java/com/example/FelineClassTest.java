package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineClassTest {

    private final int kittensCount;
    private final int expectedKittenCounts;
    Feline feline = new Feline();

    public FelineClassTest(int kittensCount, int expectedKittenCounts) {
        this.kittensCount = kittensCount;
        this.expectedKittenCounts = expectedKittenCounts;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensTestData() {
        return new Object[][]{
                {42, 42},
                {3, 3},
                {13, 13},
        };
    }

    @Test
    public void getKittensNoArgument() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithArgument() {
        int actual = feline.getKittens(kittensCount);
        assertEquals(expectedKittenCounts, actual);
    }
}
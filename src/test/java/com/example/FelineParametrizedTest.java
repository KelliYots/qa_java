package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {
    private final int kittensCount;
    private final int expectedKittensCount;
    Feline testFeline = new Feline();

    public FelineParametrizedTest(int kittensCount, int expectedKittensCount) {
    this.kittensCount = kittensCount;
    this.expectedKittensCount = expectedKittensCount;
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
    public void testGetKittensWithArgument() {
        int actual = testFeline.getKittens(kittensCount);
        assertEquals(expectedKittensCount, actual);
    }

}
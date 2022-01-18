package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private final String sex;
    private final boolean haveMane;

    public LionParametrizedTest(String sex, boolean haveMane) {
        this.sex = sex;
        this.haveMane = haveMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Feline testFeline = new Feline();
        Lion testLion = new Lion(sex, testFeline);
        boolean actual = testLion.doesHaveMane();
        Assert.assertEquals(haveMane, actual);
    }
}
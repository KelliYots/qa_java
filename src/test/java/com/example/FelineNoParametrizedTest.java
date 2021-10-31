package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineNoParametrizedTest {

    Feline testFeline = new Feline();

    @Test
    public void getKittensNoArgument() {
        assertEquals(1, testFeline.getKittens());
    }

}
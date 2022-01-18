package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTest {

    @Test
    public void getKittensTest() throws Exception {
        Feline testFeline = new Feline();
        Lion testLion = new Lion("Самец", testFeline);
        int actual = testLion.getKittens();
        Assert.assertEquals(1, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline testFeline = new Feline();
        Lion testLion = new Lion("Самец", testFeline);
        List<String> actual = testLion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }
}
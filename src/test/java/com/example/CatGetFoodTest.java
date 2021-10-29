package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CatGetFoodTest {
    @Test
    public void catFoodTest() throws Exception {
        Cat testCat = new Cat(new Feline());
        List<String> expectedFood = new ArrayList<>();
        expectedFood.add("Животные");
        expectedFood.add("Птицы");
        expectedFood.add("Рыба");

        List<String> actualFood = testCat.getFood();
        Assert.assertArrayEquals("Список еды не совпал", expectedFood.toArray(), actualFood.toArray());
    }
}


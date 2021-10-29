package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CatGetFoodTest {
    @Test
    public void shouldGetFoodAsPredator() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> expectedFood = new ArrayList<>();
        expectedFood.add("Животные");
        expectedFood.add("Птицы");
        expectedFood.add("Рыба");

        List<String> actualFood = cat.getFood();
        Assert.assertArrayEquals("Список еды не совпал", expectedFood.toArray(), actualFood.toArray());
    }
}


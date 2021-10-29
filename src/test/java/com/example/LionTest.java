package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Feline testFeline = new Feline();
    Lion testLion;
    {
        try {
            testLion = new Lion("Самка", testFeline);
        } catch (Exception lionTestException){
            lionTestException.printStackTrace();
        }
    }

    @Test
    public void lionGetKittensWillReturnOneTest() {
        int actualCittensCount = testFeline.getKittens();
        int expectedKittenCount = 1;
        assertEquals(expectedKittenCount, actualCittensCount);
    }

    @Test
    public void lionGetFoodWillReturnMeatListTest() {
        try {
            List<String> actualFoodReturn = testLion.getFood();
            List<String> expectedFoodReturn = List.of("Животные", "Птицы", "Рыба");
            assertEquals(expectedFoodReturn, actualFoodReturn);
        } catch (Exception animalFoodException) {
            Assert.fail("Exeption " + animalFoodException);
        }
    }

    @Mock
    Feline mocFeline;

    @Test
    public void lionSexExceptionMessageCorrectTextTest() {
        try {
            Lion lionIncorrectSex = new Lion("Не мальчик, не девочка, а единорог", mocFeline);
        } catch (Exception lionSexException) {
            String actualExceptionText = lionSexException.getMessage();
            String expectedExceptionText = "Используйте допустимые значения пола животного - самец или самка";
            assertEquals(expectedExceptionText, actualExceptionText);
        }
    }
}
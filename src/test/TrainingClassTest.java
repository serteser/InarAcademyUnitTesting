package test;

import main.TrainingClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TrainingClassTest {
    TrainingClass calculatorObj = new TrainingClass();

    @Test
    void testTc001Add() {

        double result = calculatorObj.add(3, 8);

        assertEquals(11, result, "3 + 8 should equals to 11");
    }

    @Test
    void testTc002Subtraction() {

        double result = calculatorObj.subtraction(3, 8);

        assertEquals(-5, result, "3 - 8 should equals to -5");
    }
}

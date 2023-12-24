package test;

import main.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calculator calculatorObj = new Calculator();

    @Test
    void testTc001Add(){

        double result = calculatorObj.add(3,8);
        assertEquals(11,result,"3 + 8 should equals to 11");
    }
    @Test
    void testTc002Subtraction(){
        double result = calculatorObj.subtraction(3,8);
        assertEquals(-5,result,"3 - 8 should equals to -5");
    }
}

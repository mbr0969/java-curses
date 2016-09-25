package ru.lesson.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(2,2);
        assertEquals(4, calculator.getResult());
    }

    @Test
    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(4,2);
        assertEquals(2, calculator.getResult());

    }
}
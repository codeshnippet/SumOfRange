package com.codeshnippet.sumofrange.calculators;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinearCalculatorTest {

    private LinearCalculator calculator;

    @Before
    public void before(){
        this.calculator = new LinearCalculator();
    }

    @Test
    public void calculateSum() throws Exception {
        // when
        int sum = calculator.calculate(new int[]{1, 2, 3, 4, 5, 6}, 2, 4);

        // then
        assertEquals(7, sum);
    }

}
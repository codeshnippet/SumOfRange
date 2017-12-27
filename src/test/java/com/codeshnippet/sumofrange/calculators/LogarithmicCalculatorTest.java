package com.codeshnippet.sumofrange.calculators;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogarithmicCalculatorTest {
    @Test
    public void calculate() throws Exception {
        // given
        LogarithmicCalculator logarithmicCalculator = new LogarithmicCalculator(new int[]{1,3,5,7,9,11});

        // when
        int sum = logarithmicCalculator.calculate(0, 5);

        // then
        assertEquals(25, sum);
    }

}
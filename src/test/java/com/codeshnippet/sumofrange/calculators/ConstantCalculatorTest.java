package com.codeshnippet.sumofrange.calculators;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConstantCalculatorTest {

    private ConstantCalculator constantCalculator;

    @Test
    public void calculate() throws Exception {
        // given
        this.constantCalculator = new ConstantCalculator(new int[]{1, 2, 3, 4, 5, 6});

        // when
        int sum = constantCalculator.calculate(2, 4);

        // then
        assertEquals(7, sum);
    }

}
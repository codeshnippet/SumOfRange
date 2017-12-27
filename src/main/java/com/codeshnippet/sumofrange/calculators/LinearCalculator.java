package com.codeshnippet.sumofrange.calculators;

import java.util.stream.IntStream;

public class LinearCalculator {

    public int calculate(int[] input, int startInclusive, int endExclusive) {
        return IntStream.range(startInclusive, endExclusive).map(i -> input[i]).sum();
    }
}

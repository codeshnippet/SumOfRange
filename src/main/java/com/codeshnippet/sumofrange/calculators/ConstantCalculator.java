package com.codeshnippet.sumofrange.calculators;

import java.util.HashMap;
import java.util.Map;

import com.codeshnippet.sumofrange.models.Range;

public class ConstantCalculator {

    private final Map<Range, Integer> cache;
    private final LinearCalculator linearCalculator;

    public ConstantCalculator(int[] input) {
        this.linearCalculator = new LinearCalculator();
        this.cache = new HashMap<>();
        for(int i = 0; i < input.length - 1; i++) {
            for(int j = i + 1; j < input.length; j++) {
                int sum = linearCalculator.calculate(input, i, j);
                cache.put(new Range(i, j), sum);
            }
        }
    }

    public int calculate(int startInclusive, int endExclusive) {
        return cache.get(new Range(startInclusive, endExclusive));
    }
}

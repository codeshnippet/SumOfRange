package com.codeshnippet.sumofrange.models;

import java.util.Objects;

public final class Range {

    private final int startInclusive;
    private final int endExclusive;

    public Range(int startInclusive, int endExclusive) {
        this.startInclusive = startInclusive;
        this.endExclusive = endExclusive;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hash(startInclusive);
        result = 31 * result + Objects.hash(endExclusive);
        return result;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Range)) {
            return false;
        }

        Range range = (Range) o;
        return range.startInclusive == this.startInclusive &&
            range.endExclusive == this.endExclusive;
    }

    public static Range of(int start, int end) {
        return new Range(start, end);
    }

    public boolean isCompletelyWithin(Range range) {
        return this.startInclusive >= range.startInclusive &&
            this.endExclusive <= range.endExclusive;
    }

    public boolean isCompletelyOutside(Range range) {
        return this.startInclusive >= range.endExclusive ||
            this.endExclusive <= range.startInclusive;
    }
}

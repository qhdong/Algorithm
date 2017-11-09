package com.qhdong.chapter1.section2;

public class Interval1D {
    private final double min;
    private final double max;

    /**
     * Initializes a closed interval [min, max].
     *
     * @param min the smaller endpoint
     * @param max the larger endpoint
     * @throws IllegalArgumentException if the min endpoint is greater than the max endpoint
     * @throws IllegalArgumentException if either {@code min} or {@code max} is {@code Double.NaN},
     *          {@code Double.POSITIVE_INFINITY} or {@code Double.NEGATIVE_INFINITY}
     */
    public Interval1D(double min, double max) {
        if (Double.isInfinite(min) || Double.isInfinite(max))
            throw new IllegalArgumentException("Endpoints must be finite");
        if (Double.isNaN(min) || Double.isNaN(max))
            throw new IllegalArgumentException("Endpoints cannot be NaN");

        // convert -0.0 to +0.0
        if (min == 0.0) min = 0.0;
        if (max == 0.0) max = 0.0;

        if (min <= max) {
            this.min = min;
            this.max = max;
        }
        else throw new IllegalArgumentException("Illegal interval");
    }

    public double min() {
        return min;
    }

    public double max() {
        return max;
    }

    public boolean intersects(Interval1D that) {
        return this.max >= that.min && this.min <= that.max;
    }

    public boolean contains(double x) {
        return min <= x && x <= max;
    }

    public double length() {
        return max - min;
    }

    @Override
    public String toString() {
        return "[" + min + ", " + max + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != this.getClass()) return false;
        Interval1D that = (Interval1D) other;
        return min == that.min && max == that.max;
    }

    @Override
    public int hashCode() {
        int hashMin = Double.valueOf(min).hashCode();
        int hashMax = Double.valueOf(max).hashCode();
        return hashMin * 31 + hashMax;
    }
}

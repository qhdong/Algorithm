package com.qhdong.chapter1.section2;

import edu.princeton.cs.algs4.StdDraw;

public final class Point2D implements Comparable<Point2D> {
    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        if (Double.isInfinite(x) || Double.isInfinite(y)) {
            throw new IllegalArgumentException("Coordinates must be finite.");
        }
        if (Double.isNaN(x) || Double.isNaN(y)) {
            throw new IllegalArgumentException("Coordinates cannot be NaN");
        }
        // convert -0.0 to +0.0
        if (x == 0.0) this.x = 0.0;
        else this.x = x;
        if (y == 0.0) this.y = 0.0;
        else this.y = y;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double r() {
        return Math.hypot(x, y);
    }

    /**
     * Returns the angle of this point in polar coordinates.
     * @return the angle (in radians) of this point in polar coordinates (between -&pi; and &pi;)
     */
    public double theta() {
        return Math.atan2(y, x);
    }

    private double angleTo(Point2D that) {
        double dx = that.x - this.x;
        double dy = that.y - this.y;
        return Math.atan2(dy, dx);
    }

    public double distanceTo(Point2D that) {
        double dx = that.x - this.x;
        double dy = that.y - this.y;
        return Math.hypot(dx, dy);
    }

    @Override
    public int compareTo(Point2D that) {
        int res = Double.compare(this.y, that.y);
        if (res == 0) {
            res = Double.compare(this.x, that.x);
        }
        return res;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Point2D that = (Point2D) other;
        return Double.compare(this.x, that.x) == 0 && Double.compare(this.y, that.y) == 0;
    }

    @Override
    public int hashCode() {
        int hashX = Double.valueOf(x).hashCode();
        int hashY = Double.valueOf(y).hashCode();
        return 31 * hashX + hashY;
    }

    public void draw() {
        StdDraw.point(x, y);
    }

    public void drawTo(Point2D that) {
        StdDraw.line(x, y, that.x, that.y);
    }

}

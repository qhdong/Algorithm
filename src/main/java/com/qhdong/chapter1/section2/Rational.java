package com.qhdong.chapter1.section2;

public class Rational {

    private int numerator;
    private int denominator;

    Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator can not be 0");
        }
        int d = gcd(numerator, denominator);
        this.numerator = numerator / d;
        this.denominator = denominator / d;
    }

    Rational plus(Rational b) {
        int numerator = this.numerator * b.denominator + this.denominator * b.numerator;
        int denominator = this.denominator * b.denominator;
        return new Rational(numerator, denominator);
    }

    Rational minus(Rational b) {
        int numerator = this.numerator * b.denominator - this.denominator * b.numerator;
        int denominator = this.denominator * b.denominator;
        return new Rational(numerator, denominator);
    }

    Rational times(Rational b) {
        int numerator = this.numerator * b.numerator;
        int denominator = this.denominator * b.denominator;
        return new Rational(numerator, denominator);
    }

    Rational divides(Rational b) {
        int numerator = this.numerator * b.denominator;
        int denominator = this.denominator * b.numerator;
        return new Rational(numerator, denominator);
    }

    private static int gcd(int p, int q) {
        while (q != 0) {
            int r = p % q;
            p = q;
            q = r;
        }
        return p;
    }

    @Override
    public String toString() {
        boolean negative = numerator < 0 || denominator < 0;
        return (negative ? "- " : "") + Math.abs(numerator) + "/" + Math.abs(denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Rational that = (Rational) obj;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        int hash = 13;
        hash = 31 * hash + numerator;
        hash = 31 * hash + denominator;
        return hash;
    }

    public static void main(String[] args) {
        Rational a = new Rational(-2, -8);
        Rational b = new Rational(-2, 3);
        System.out.printf("a = %s%n", a);
        System.out.printf("b = %s%n", b);
        System.out.printf("a + b = %s%n", a.plus(b));
        System.out.printf("a - b = %s%n", a.minus(b));
        System.out.printf("a / b = %s%n", a.divides(b));
        System.out.printf("a * b = %s%n", a.times(b));
    }
}

package com.qhdong.chapter1.section1;

public class MyMath {
    public static int abs(int x) {
        if (x < 0) return -x;
        else return x;
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        final double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

    public static double H(int N) {
        double sum = 0.;
        for (int i = 1; i <= N; i++) {
            sum += 1. / i;
        }
        return sum;
    }
}

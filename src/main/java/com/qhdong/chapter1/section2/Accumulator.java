package com.qhdong.chapter1.section2;

import edu.princeton.cs.algs4.StdRandom;

public class Accumulator {

    private double total;
    private int N;

    public void addDataValue(double val) {
        total += val;
        N++;
    }

    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }

    public static void main(String[] args) {
        int T = StdRandom.uniform(10000);
        Accumulator a = new Accumulator();
        for (int i = 0; i < T; i++) {
            a.addDataValue(StdRandom.uniform());
        }
        System.out.println(a);
    }
}

package com.qhdong.chapter1.section1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.List;

public class exp1131 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);

        double cx = 0.5;
        double cy = 0.5;
        double r = 0.3;

        StdDraw.circle(cx, cy, r);
        StdDraw.point(cx, cy);

        StdDraw.setPenRadius(.05);
        double[] X = new double[N];
        double[] Y = new double[N];
        for (int i = 0; i < N; i++) {
            double theta = 2 * Math.PI * i / N;
            double x = cx + r * Math.cos(theta);
            double y = cy + r * Math.sin(theta);
            X[i] = x;
            Y[i] = y;
            StdDraw.point(x, y);
        }

        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setPenRadius();
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (StdRandom.uniform() < p) {
                    StdDraw.line(X[i], Y[i], X[j], Y[j]);
                }
            }
        }
    }
}

package com.qhdong.chapter1.section1;

public class Matrix {
    /**
     * vector's dot multiply
     * @param x vector
     * @param y vector
     * @return result
     */
    public static double dot(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("x and y's size must be equal");
        }
        double res = 0.;
        for (int i = 0; i < x.length; i++) {
            res += x[i] * y[i];
        }
        return res;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        int x = a.length;
        int y = a[0].length;
        int y2 = b.length;
        int z = b[0].length;
        if (y != y2) {
            throw new IllegalArgumentException("matrix must meet the same order");
        }

        double[][] res = new double[x][z];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                for (int k = 0; k < y; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    public static double[][] transpose(double[][] a) {
        int m = a.length;
        int n = a[0].length;

        double[][] res = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = a[j][i];
            }
        }
        return res;
    }

    public static double[] mult(double[][] a, double[] x) {
        int m = a.length;
        int n = a[0].length;
        int p = x.length;
        if (n != p) {
            throw new IllegalArgumentException("must be the same size");
        }
        double[] res = new double[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i] += a[i][j] * x[j];
            }
        }
        return res;
    }

    public static double[] mult(double[] x, double[][] a) {
        return mult(transpose(a), x);
    }
}

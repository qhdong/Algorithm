package com.qhdong.chapter1.section1;

public class exp1130 {
    public static boolean[][] genMatrix(int m, int n) {
        boolean[][] matrix = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Euclid.gcd(i, j) == 1;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        boolean[][] matrix = genMatrix(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d, ", matrix[i][j] ? 1 : 0);
            }
            System.out.println();
        }
    }
}

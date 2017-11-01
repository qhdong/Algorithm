package com.qhdong.chapter1.section1;

public class exp1113 {
    public static void printTranspose(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d, ", a[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        printTranspose(a);
    }
}

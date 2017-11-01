package com.qhdong.chapter1.section1;

import edu.princeton.cs.algs4.StdRandom;

public class ShuffleTest {
    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = i + StdRandom.uniform(N-i);
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }

    public static void badShuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(N);
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }

    public static void init(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }

    public static void main(String[] args) {
        int M = 5;
        int N = 1000;
        int[] a = new int[M];
        int[][] table = new int[M][M];
        for (int i = 0; i < N; i++) {
            init(a);
            shuffle(a);
//            badShuffle(a);
            for (int j = 0; j < a.length; j++) {
                table[j][a[j]]++;
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}

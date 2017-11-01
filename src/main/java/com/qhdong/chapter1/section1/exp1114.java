package com.qhdong.chapter1.section1;

public class exp1114 {
    public static int lg(int N) {
        // find MSB of N
//        N |= N >> 1;
//        N |= N >> 2;
//        N |= N >> 4;
//        N |= N >> 8;
//        N |= N >> 16;
//        N += 1;
//        N >>= 1;
//        int count = 0;
//        while (N != 0) {
//            count++;
//            N >>= 1;
//        }
//        return count-1;
        if (N <= 0) {
            throw new IllegalArgumentException("N should be positive: " + N);
        }
        int count = 30;
        int mask = 1 << count;
        while ((N & mask) == 0) {
            count -= 1;
            mask >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(lg(1025));
        System.out.println(lg(2047));
    }
}

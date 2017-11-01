package com.qhdong.chapter1.section1;

public class Euclid {
    public static int gcd(int p, int q) {
        while (q > 0) {
            int r = p % q;
            p = q;
            q = r;
        }
        return p;
    }

    public static int gcdRec(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcdRec(q, r);
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        System.out.println(gcd(p, q));
    }
}

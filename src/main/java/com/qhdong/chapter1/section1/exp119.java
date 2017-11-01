package com.qhdong.chapter1.section1;

public class exp119 {
    public static String toBinaryString(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("should be positive number: " + x);
        }
        if (x == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while (x != 0) {
            sb.append(x & 1);
            x >>= 1;
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toBinaryString(10));
    }
}

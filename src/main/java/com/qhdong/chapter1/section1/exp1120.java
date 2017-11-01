package com.qhdong.chapter1.section1;

public class exp1120 {
    public static double ln(int n) {
        if (n == 0) return 0;
        if (n == 1) return 0;
        return Math.log(n) + ln(n-1);
    }
}

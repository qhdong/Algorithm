package com.qhdong.chapter1.section2;

public class Exp {
    public static boolean isCircularRotation(String s, String t) {
        return s.length() == t.length() && (s + t).contains(s);
    }

    public static String reverse(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return reverse(b) + reverse(a);
    }

    public static void main(String[] args) {
        String s = "ACTGACG";
        String t = "TGACGAC";
        System.out.println(isCircularRotation(s, t));

        System.out.println(reverse(s));
    }
}

package com.qhdong.chapter1.section1;

public class exp1118 {
    public static int product(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return product(a*a, b/2);
        else return product(a*a, b/2) * a;
    }

    public static int sum(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return sum(a + a, b / 2);
        else return sum(a+a, b/2) + a;
    }
    public static void main(String[] args) {
        System.out.println(product(2, 10));
        System.out.println(sum(2, 10));
    }
}

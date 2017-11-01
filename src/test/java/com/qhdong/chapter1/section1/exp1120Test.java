package com.qhdong.chapter1.section1;

import org.junit.Test;

import static org.junit.Assert.*;

public class exp1120Test {
    @Test
    public void ln() throws Exception {
        int n = 10;
        double res = 0;
        for (int i = 1; i <= n; i++) {
            res += Math.log(i);
        }
        assertTrue(Math.abs(res - exp1120.ln(n)) < 1e-10);
    }

}
package com.qhdong.chapter1.section1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EuclidTest {
    @Test
    public void gcd() throws Exception {
        int p = 1_111_111;
        int q = 1_234_567;
        assertEquals(Euclid.gcdRec(p, q), Euclid.gcd(p, q));
    }

}
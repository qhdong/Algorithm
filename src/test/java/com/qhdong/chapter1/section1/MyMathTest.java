package com.qhdong.chapter1.section1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {
    @Test
    public void testAbs() throws Exception {
        assertEquals(3, MyMath.abs(-3));
        assertEquals(3, MyMath.abs(3));
    }

    @Test
    public void isPrime() throws Exception {
        assertTrue(MyMath.isPrime(2));
        assertFalse(MyMath.isPrime(4));
    }

    @Test
    public void sqrt() throws Exception {
        final double err = 1e-10;
        double x = 12394;
        assertTrue(Math.abs(MyMath.sqrt(x) - Math.sqrt(x)) < err);
    }

    @Test
    public void h() throws Exception {
        System.out.println(MyMath.H(234));
    }

}
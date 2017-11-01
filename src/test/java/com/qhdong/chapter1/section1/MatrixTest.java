package com.qhdong.chapter1.section1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatrixTest {

    private final double[][] x = {
            {1, 2, 3},
            {4, 5, 6},
    };

    private final double[][] y = {
            {1, 2},
            {3, 4},
            {5, 6},
    };

    private final double[] vx = {1, 2, 3};
    private final double[] vy = {4, 5, 6};

    @Test
    public void dot() throws Exception {
        assertEquals(1*4+2*5+3*6, Matrix.dot(vx, vy), 1e-10);
    }

    @Test
    public void mult() throws Exception {
        System.out.println(Arrays.deepToString(Matrix.mult(x, y)));

    }

    @Test
    public void transpose() throws Exception {
        System.out.println(Arrays.deepToString(Matrix.transpose(x)));
    }

    @Test
    public void mult1() throws Exception {
        System.out.println(Arrays.toString(Matrix.mult(vx, y)));
    }

    @Test
    public void mult2() throws Exception {
        System.out.println(Arrays.toString(Matrix.mult(x, vx)));
    }

}
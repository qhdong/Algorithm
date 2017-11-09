package com.qhdong.chapter1.section2;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisualAccumulatorTest {

    @Test
    public void testVisualAccumulator() {
        int T = 1000;
        VisualAccumulator a = new VisualAccumulator(T, 1);
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.uniform());
        }
    }

}
package com.qhdong.chapter1.section1;

import org.junit.Test;

import static org.junit.Assert.*;

public class exp119Test {
    @Test
    public void toBinaryString() throws Exception {
        for (int i = 0; i < 100; i++) {
            assertEquals(Integer.toBinaryString(i), exp119.toBinaryString(i));
        }
    }

}
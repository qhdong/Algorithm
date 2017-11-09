package com.qhdong.chapter1.section2;

public class Counter {
    private String name;
    private int cnt;

    public Counter(String name) {
        this.name = name;
    }

    public void increment() {
        cnt++;
    }

    public int tally() {
        return cnt;
    }

    @Override
    public String toString() {
        return cnt + " " + name;
    }
}

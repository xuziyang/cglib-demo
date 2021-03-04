package com.xzy.jdk;

public class MyCalculator implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }
}
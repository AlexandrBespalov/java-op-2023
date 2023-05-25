package ru.vsuet.course2.testMatrix;

public class AdditionCalculator implements Calculator {
    @Override
    public int calculateSum(int a, int b) {
        return a + b;
    }

    @Override
    public int calculateDifference(int a, int b) {
        return a - b;
    }

    @Override
    public int calculateProduct(int a, int b) {
        return a * b;
    }
}

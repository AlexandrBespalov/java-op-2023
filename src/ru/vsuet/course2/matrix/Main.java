package ru.vsuet.course2.matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.fillRandom();
        System.out.println("Исходная матрица:");
        matrix.printMatrix();

        Calculator calculator = new AdditionCalculator();
        matrix.performOperations(calculator);
    }
}
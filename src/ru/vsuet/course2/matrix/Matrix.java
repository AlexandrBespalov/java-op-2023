package ru.vsuet.course2.matrix;

public class Matrix {
    private int[][] matrix;

    // Конструктор для создания матрицы размером 5x5
    public Matrix(int[][] matrix) {
        if (matrix.length == 5 && matrix[0].length == 5) {
            this.matrix = matrix;
        } else {
            throw new IllegalArgumentException("Матрица должна быть размером 5x5");
        }
    }

    public int sumAboveDiagonal() {
        int sum = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public int differenceBelowDiagonal() {
        int difference = 0;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                difference -= matrix[i][j];
            }
        }

        return difference;
    }
}

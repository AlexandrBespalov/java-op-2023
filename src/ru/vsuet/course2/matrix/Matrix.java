package ru.vsuet.course2.matrix;

import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix() {
        matrix = new int[5][5];
    }

    public void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void performOperations(Calculator calculator) {
        int sumAboveDiagonal = 0;
        int differenceBelowDiagonal = 0;
        int productOnDiagonal = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j) {
                    sumAboveDiagonal = calculator.calculateSum(sumAboveDiagonal, matrix[i][j]);
                } else if (i > j) {
                    differenceBelowDiagonal = calculator.calculateDifference(differenceBelowDiagonal, matrix[i][j]);
                } else {
                    productOnDiagonal = calculator.calculateProduct(productOnDiagonal, matrix[i][j]);
                }
            }
        }

        System.out.println("Сумма элементов выше главной диагонали: " + sumAboveDiagonal);
        System.out.println("Разность элементов ниже главной диагонали: " + differenceBelowDiagonal);
        System.out.println("Произведение элементов на главной диагонали: " + productOnDiagonal);
    }
}

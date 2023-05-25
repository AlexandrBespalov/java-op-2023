package ru.vsuet.course2.matrix2;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;

public class Matrix {
    private int[][] matrix;

    public Matrix(int size) {
        matrix = new int[size][size];
        fillRandom(); // Заполнение матрицы случайными значениями
    }

    public int calculate(
            BiFunction<Integer, Integer, Boolean> condition,
            BiFunction<Integer, Integer, Integer> expression,
            Integer accumulator
    ) {
        int result = accumulator; // Начальное значение аккумулятора
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (condition.apply(i, j)) {
                    result = expression.apply(result, matrix[i][j]);
                    // Применение условия и выражения к элементу матрицы
                }
            }
        }
        return result; // Возвращение результата
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString().replace("[[", "[").replace("]]", "]");
        // Представление матрицы в виде строки
    }

    private void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        // Заполнение матрицы случайными значениями
    }

    private void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Вывод матрицы на экран
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
        // Выполнение операций над матрицей и вывод результатов
    }
}

package ru.vsuet.course2.matrix2;

import java.util.Objects;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(5);
        System.out.println(matrix);
        System.out.println(matrix.calculate((i, j) -> i > j, Integer::sum, 0));
        System.out.println(matrix.calculate((i, j) -> i < j, (acc, item) -> acc - item, 0));
        System.out.println(matrix.calculate(Objects::equals, (acc, item) -> acc * item, 1));

        // matrix.printMatrix();
        // calculator.calculateSum(sumAboveDiagonal, matrix[i][j]);
        // calculator.calculateDifference(differenceBelowDiagonal, matrix[i][j]);
        // calculator.calculateProduct(productOnDiagonal, matrix[i][j]);
        // Выполнение операций над матрицей
    }
}

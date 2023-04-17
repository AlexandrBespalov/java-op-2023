package ru.vsuet.course2.matrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrixData = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        Matrix matrix = new Matrix(matrixData);
        int sumAboveDiagonal = matrix.sumAboveDiagonal();
        int differenceBelowDiagonal = matrix.differenceBelowDiagonal();

        System.out.println("Сумма элементов над главной диагональю: " + sumAboveDiagonal);
        System.out.println("Разность элементов под главной диагональю: " + differenceBelowDiagonal);
    }
}

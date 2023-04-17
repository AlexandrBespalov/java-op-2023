package ru.vsuet.course1.cp1.task1;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        // получаем матрицу от пользователя
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int rows = input.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Введите элемент [%d][%d]: ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }

        // транспонирование матрицы
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        // выводим транспонированную матрицу на экран
        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

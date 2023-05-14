package ru.vsuet.course1.cp3.task47;

import java.util.ArrayList;
import java.util.List;

public class SnailArraySort {
    public static List<Integer> snail(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int n = array.length;
        int rowBegin = 0, rowEnd = n - 1;
        int colBegin = 0, colEnd = n - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Слева направо
            for (int i = colBegin; i <= colEnd; i++) {
                result.add(array[rowBegin][i]);
            }
            rowBegin++;

            // Сверху вниз
            for (int i = rowBegin; i <= rowEnd; i++) {
                result.add(array[i][colEnd]);
            }
            colEnd--;

            // Справа налево
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    result.add(array[rowEnd][i]);
                }
                rowEnd--;
            }

            // Снизу вверх
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(array[i][colBegin]);
                }
                colBegin++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{5, 2, 8}, {4, 6, 3}, {1, 9, 0}};
        List<Integer> sorted = snail(array);
        System.out.println(sorted);  // Вывод: [5, 2, 8, 3, 0, 9, 1, 4, 6]
    }
}

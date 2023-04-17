package ru.vsuet.course1.cp3.task44;

public class StringSum {
    public static String sum(String num1, String num2) {
        // Преобразуем строки в числа
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        // Складываем числа
        int sum = n1 + n2;

        // Преобразуем результат обратно в строку и возвращаем
        return String.valueOf(sum);
    }
}

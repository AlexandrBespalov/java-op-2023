package ru.vsuet.course1.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем две строки
        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();

        // Проверяем, является ли вторая строка окончанием первой
        boolean endsWith = str1.endsWith(str2);

        // Выводим результат
        if (endsWith) {
            System.out.println("Вторая строка является окончанием первой.");
        } else {
            System.out.println("Вторая строка не является окончанием первой.");
        }
    }
}


package ru.vsuet.course1.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        // Преобразуем первую букву имени в верхний регистр, а остальные - в нижний
        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        // Выводим приветствие с использованием форматирования строк
        System.out.printf("Привет, %s!", formattedName);
    }
}


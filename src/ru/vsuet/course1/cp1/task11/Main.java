package ru.vsuet.course1.cp1.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = scanner.nextLine();

        // Удаляем все гласные из строки
        String result = str.replaceAll("[aeiouAEIOU]", "");

        System.out.println("Результат: " + result);
    }
}


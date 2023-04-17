package ru.vsuet.course1.task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало ряда:");
        int start = scanner.nextInt();

        System.out.println("Введите шаг:");
        int step = scanner.nextInt();

        System.out.println("Введите количество шагов:");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int num = start + i * step;
            System.out.print(num + " ");
        }
    }
}


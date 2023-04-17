package ru.vsuet.course1.cp1.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем длины отрезков
        System.out.println("Введите длины трех отрезков:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Проверяем, можно ли из отрезков составить треугольник
        if (a + b > c && b + c > a && c + a > b) {
            // Вычисляем углы треугольника в радианах
            double alpha = Math.acos((b * b + c * c - a * a) / (2.0 * b * c));
            double beta = Math.acos((c * c + a * a - b * b) / (2.0 * c * a));
            double gamma = Math.acos((a * a + b * b - c * c) / (2.0 * a * b));

            // Вычисляем угол в градусах
            double maxAngle = Math.toDegrees(Math.max(alpha, Math.max(beta, gamma)));

            System.out.println("Можно составить треугольник. Наибольший внешний угол: " + maxAngle);
        } else {
            System.out.println("Из данных отрезков невозможно составить треугольник.");
        }
    }
}


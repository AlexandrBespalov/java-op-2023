package ru.vsuet.course1.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int closestSquare = 0;
        int closestDistance = Integer.MAX_VALUE;

        for (int i = 0; i <= num; i++) {
            int square = i * i;
            int distance = Math.abs(num - square);

            if (distance < closestDistance) {
                closestDistance = distance;
                closestSquare = square;
            }
        }

        System.out.println("Ближайший квадрат: " + closestSquare);
    }
}


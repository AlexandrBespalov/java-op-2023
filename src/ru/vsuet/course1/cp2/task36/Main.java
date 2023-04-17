package ru.vsuet.course1.cp2.task36;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] secretCode = new int[4];
        for (int i = 0; i < 4; i++) {
            secretCode[i] = random.nextInt(10);
        }

        System.out.println("Угадайте код из четырех символов");

        int attemptsLeft = 20;
        while (attemptsLeft > 0) {
            System.out.println("Осталось попыток: " + attemptsLeft);
            int[] guess = new int[4];
            System.out.print("Введите 4 числа (от 0 до 9): ");
            for (int i = 0; i < 4; i++) {
                guess[i] = scanner.nextInt();
            }

            int numMatches = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == secretCode[i]) {
                    numMatches++;
                }
            }

            if (numMatches == 4) {
                System.out.println("Вы угадали код!");
                return;
            } else {
                System.out.println("Совпадений: " + numMatches);
            }

            attemptsLeft--;
        }

        System.out.println("Вы проиграли, попытки закончились");
    }
}

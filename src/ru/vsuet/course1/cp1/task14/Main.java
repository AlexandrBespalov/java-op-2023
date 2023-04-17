package ru.vsuet.course1.cp1.task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        while (index < numbers.length) {
            System.out.print("Введите число: ");
            int input = scanner.nextInt();

            if (index == 0 || input > numbers[index - 1]) {
                numbers[index] = input;
                index++;
            } else {
                for (int i = 0; i < index; i++) {
                    if (input < numbers[i]) {
                        for (int j = index - 1; j >= i; j--) {
                            numbers[j + 1] = numbers[j];
                        }
                        numbers[i] = input;
                        break;
                    }
                }
            }

            System.out.println("Текущие числа: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        }
    }
}


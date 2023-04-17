package ru.vsuet.course1.cp2.task29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int start = scanner.nextInt();

        int sum = 0;
        int power = 1;
        while (true) {
            int digit = getDigit(num, power);
            if (digit == 0) {
                break;
            }
            sum += Math.pow(start, power) * digit;
            power++;
        }

        for (int i = 2; i <= Math.pow(2, 6); i++) {
            if (sum % i == 0 && isFactor(start, i)) {
                System.out.println(sum + " = " + start + " * " + (sum / i));
                return;
            }
        }

        System.out.println("Impossible");
    }

    private static int getDigit(int num, int power) {
        int divisor = (int) Math.pow(10, power - 1);
        return num / divisor % 10;
    }

    private static boolean isFactor(int num, int factor) {
        while (num % factor == 0) {
            num /= factor;
        }
        return num == 1;
    }
}

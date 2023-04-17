package ru.vsuet.course1.cp2.task32;

import java.util.Scanner;

public class WoodenSticksGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        boolean sashaTurn = true;
        while (n > 1) {
            if (n % 2 == 0) {
                if (sashaTurn) {
                    n = n / 2;
                } else {
                    n = n - 1;
                }
            } else {
                n = n - 1;
            }
            sashaTurn = !sashaTurn;
        }
        if (sashaTurn) {
            System.out.println("Таня");
        } else {
            System.out.println("Саша");
        }
    }
}

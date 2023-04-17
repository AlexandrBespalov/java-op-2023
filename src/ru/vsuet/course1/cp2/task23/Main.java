package ru.vsuet.course1.cp2.task23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 || i % b == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}

package ru.vsuet.course1.cp2.task28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int x = (int) Math.sqrt(n); // находим ближайший квадрат числа, меньший чем n
        int y = x + 1; // следующий квадрат числа

        int diff = y * y - x * x; // разница между двумя последовательными квадратами числа

        if (diff == n) {
            System.out.println(x * x + " " + y * y);
        } else {
            System.out.println("Invalid input");
        }
    }
}

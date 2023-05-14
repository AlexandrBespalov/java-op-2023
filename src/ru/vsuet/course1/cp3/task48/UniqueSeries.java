package ru.vsuet.course1.cp3.task48;

import java.util.HashSet;

public class UniqueSeries {
    public static void main(String[] args) {
        int n = 30; // Количество чисел в ряду u
        HashSet<Integer> u = new HashSet<>();

        int x = 0;
        int y, z;

        while (u.size() < n) {
            y = 2 * x + 1;
            z = 3 * x + 1;
            u.add(x);
            u.add(y);
            u.add(z);
            x++;
        }

        System.out.println("Ряд чисел u без дубликатов:");
        for (int num : u) {
            System.out.print(num + " ");
        }
    }
}

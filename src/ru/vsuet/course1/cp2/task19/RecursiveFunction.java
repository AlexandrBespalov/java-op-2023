package ru.vsuet.course1.cp2.task19;

public class RecursiveFunction {
    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            int result = func(n);
            System.out.println("func(" + n + ") = " + result);
        }
    }

    public static int func(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return func(n / 2);
        } else {
            return func(n / 2) + func(n / 2 + 1);
        }
    }
}


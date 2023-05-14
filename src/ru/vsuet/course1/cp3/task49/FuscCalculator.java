package ru.vsuet.course1.cp3.task49;

public class FuscCalculator {
    public static int fusc(int n) {
        int a = 0;
        int b = 1;

        if (n == 0) {
            return a; // Возвращаем a, так как fusc(0) = 0 (уравнение 1)
        }

        if (n == 1) {
            return b; // Возвращаем b, так как fusc(1) = 1 (уравнение 2)
        }

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2; // Уменьшаем n в два раза, так как n четное (уравнение 3)
            } else {
                n = n - 1; // Уменьшаем n на единицу, так как n нечетное (уравнение 4)
                int temp = a; // Временная переменная для обмена значениями a и b
                a = a + b; // Обновляем a суммой a и b (уравнение 4)
                b = temp; // Присваиваем b предыдущее значение a
            }
        }

        return a; // Возвращаем a, содержащее вычисленное n-е число Фуска
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.println(fusc(0)); // Ожидаемый вывод: 0
        System.out.println(fusc(1)); // Ожидаемый вывод: 1
        System.out.println(fusc(2)); // Ожидаемый вывод: 1
        System.out.println(fusc(3)); // Ожидаемый вывод: 1
        System.out.println(fusc(4)); // Ожидаемый вывод: 2
        // и так далее
    }
}

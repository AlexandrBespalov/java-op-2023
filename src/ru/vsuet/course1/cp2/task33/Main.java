package ru.vsuet.course1.cp2.task33;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); // количество палочек
        long tanyaSticks = playGame(n, true); // количество палочек у Тани
        System.out.println(tanyaSticks);
    }

    // Рекурсивная функция, имитирующая игру
    private static long playGame(long sticks, boolean tanyaTurn) {
        if (sticks == 1) { // если осталась 1 палочка, то игрок может взять только ее
            return tanyaTurn ? 0 : 1; // если ход Тани - вернуть 0, иначе 1
        }
        if (sticks % 2 == 0) { // если количество палочек четное
            if (tanyaTurn) { // если ход Тани
                return playGame(sticks / 2, !tanyaTurn); // Таня возьмет половину палочек
            } else { // если ход Саши
                if (sticks == 2) { // если осталось 2 палочки, то Саша возьмет 1
                    return 1;
                } else {
                    return Math.max(playGame(sticks - 1, !tanyaTurn), playGame(sticks / 2, !tanyaTurn)); // Саша возьмет 1 или половину палочек, чтобы оставить меньшее количество палочек Тане
                }
            }
        } else { // если количество палочек нечетное
            return playGame(sticks - 1, !tanyaTurn); // Таня берет 1 палочку, Саша будет играть с оставшимися
        }
    }
}

package ru.vsuet.course1.cp2.task37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();
        System.out.print("Введите номер игрока, с которого начинается игра: ");
        int start = scanner.nextInt();

        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }

        List<Integer> result = new ArrayList<>();
        int count = 0;
        int index = start - 1;

        while (players.size() > 1) {
            count++;
            index = (index + count) % players.size();
            if (count % 3 == 0) {
                result.add(players.remove(index));
                index--;
            }
        }

        result.addAll(players);
        System.out.println(result);
    }
}

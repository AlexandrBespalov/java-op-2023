package ru.vsuet.course1.task15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        String output = String.join(" ", uniqueWords);
        System.out.println(output);
    }
}


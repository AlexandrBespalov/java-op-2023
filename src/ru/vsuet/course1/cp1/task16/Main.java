package ru.vsuet.course1.cp1.task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }

        String output;
        if (upperCount > lowerCount) {
            output = input.toUpperCase();
        } else if (upperCount < lowerCount) {
            output = input.toLowerCase();
        } else {
            output = input.toLowerCase();
        }

        System.out.println(output);
    }
}


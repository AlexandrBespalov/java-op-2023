package ru.vsuet.course1.cp2.task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int shift = scanner.nextInt();
        String direction = scanner.next();

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (direction.equals("right")) {
                    c = (char) ((c - 'a' + shift) % 26 + 'a');
                } else if (direction.equals("left")) {
                    c = (char) ((c - 'a' - shift + 26) % 26 + 'a');
                }
            }
            result += c;
        }

        System.out.println(result);
    }
}

package ru.vsuet.course1.cp2.task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int maxPalindromeLength = 1;
        String maxPalindrome = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            String currentPalindrome = getPalindrome(s, i, i);
            if (currentPalindrome.length() > maxPalindromeLength) {
                maxPalindromeLength = currentPalindrome.length();
                maxPalindrome = currentPalindrome;
            }

            currentPalindrome = getPalindrome(s, i, i + 1);
            if (currentPalindrome.length() > maxPalindromeLength) {
                maxPalindromeLength = currentPalindrome.length();
                maxPalindrome = currentPalindrome;
            }
        }

        System.out.println(maxPalindromeLength);
    }

    private static String getPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}

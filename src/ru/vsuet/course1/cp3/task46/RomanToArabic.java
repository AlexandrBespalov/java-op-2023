package ru.vsuet.course1.cp3.task46;

import java.util.HashMap;

public class RomanToArabic {
    public static int convert(String roman) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            int value = map.get(roman.charAt(i));
            if (i + 1 < roman.length() && map.get(roman.charAt(i + 1)) > value) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }
}

package ru.vsuet.course1.cp2.task21;

import java.util.HashMap;
import java.util.Map;

public class NumpadConverter {
    public static void main(String[] args) {
        String numpadNumbers = "789";
        String phoneNumber = convertNumpadToPhone(numpadNumbers);
        System.out.println(phoneNumber); // выводит "123"
    }

    public static String convertNumpadToPhone(String numpadNumbers) {
        Map<Character, Character> map = new HashMap<>();
        map.put('1', '1');
        map.put('2', '2');
        map.put('3', '3');
        map.put('4', '4');
        map.put('5', '5');
        map.put('6', '6');
        map.put('7', '7');
        map.put('8', '8');
        map.put('9', '9');
        map.put('0', '0');

        map.put('2', 'A');
        map.put('3', 'D');
        map.put('4', 'G');
        map.put('5', 'J');
        map.put('6', 'M');
        map.put('7', 'P');
        map.put('8', 'T');
        map.put('9', 'W');

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numpadNumbers.length(); i++) {
            char c = numpadNumbers.charAt(i);
            sb.append(map.get(c));
        }
        return sb.toString();
    }
}

package ru.vsuet.course1.cp3.task45;

public class RomanConverter {

    private static final String[] thousands = {"", "M", "MM", "MMM"};
    private static final String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public static String convertToRoman(int number) {
        if (number < 1 || number > 9999) {
            throw new IllegalArgumentException("Number out of range (1-9999)");
        }

        StringBuilder result = new StringBuilder();
        result.append(thousands[number / 1000]);
        result.append(hundreds[(number % 1000) / 100]);
        result.append(tens[(number % 100) / 10]);
        result.append(ones[number % 10]);

        return result.toString();
    }
}

package ru.vsuet.course1.cp2.task35;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipherDecoder {

    public static void main(String[] args) {
        // текст, который нужно расшифровать
        String cipheredText = "шифр, который нужно расшифровать";

        // получаем частотность букв в тексте
        Map<Character, Integer> frequencies = getFrequencies(cipheredText);

        // выводим частотность букв в порядке убывания
        frequencies.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    /**
     * Метод для получения частотности букв в тексте
     * @param text текст для анализа
     * @return Map<Character, Integer>, где ключ - буква, значение - количество вхождений в текст
     */
    public static Map<Character, Integer> getFrequencies(String text) {
        Map<Character, Integer> frequencies = new HashMap<>();

        // проходим по всем символам текста и увеличиваем счетчик для соответствующей буквы
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
            }
        }

        return frequencies;
    }
}

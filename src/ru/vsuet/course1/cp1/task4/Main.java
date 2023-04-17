package ru.vsuet.course1.cp1.task4;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = 'o';
        int count = str_count(str, ch);
        System.out.println(count); // выводим результат на экран
    }

    public static int str_count(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) { // если текущий символ равен заданному
                count++; // увеличиваем счетчик вхождений
            }
        }
        return count;
    }
}


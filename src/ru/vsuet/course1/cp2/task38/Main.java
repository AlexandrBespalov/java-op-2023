package ru.vsuet.course1.cp2.task38;

public class Main {
    public static void main(String[] args) {
        String text = "В программу поступает текст в виде одного или нескольких предложений. Нужно изменить текст следующим образом: переместить первую букву каждого слова в конец и добавить текст 'ауч'. Знаки препинания не трогаем.";
        String[] sentences = text.split("\\.\\s*");

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split("\\s+");
            for (int j = 0; j < words.length; j++) {
                char firstLetter = words[j].charAt(0);
                String rest = words[j].substring(1);
                words[j] = rest + firstLetter + "ауч";
            }
            sentences[i] = String.join(" ", words) + ".";
        }

        String result = String.join(" ", sentences);
        System.out.println(result);
    }
}

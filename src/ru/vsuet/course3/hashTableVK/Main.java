package ru.vsuet.course3.hashTableVK;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        HashTable<String> hashTable = new HashTable<>();

        // Добавление элементов
        hashTable.put("key1");
        hashTable.put("key2");
        hashTable.put("key3");

        // Получение элемента
        String value1 = hashTable.get("key1");
        System.out.println("Значение key1: " + value1);

        // Удаление элемента
        boolean removed = hashTable.remove("key2");
        System.out.println("Удаление key2: " + removed);

        // Попытка получить удаленный элемент
        try {
            String value2 = hashTable.get("key2");
            System.out.println("Значение key2: " + value2);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
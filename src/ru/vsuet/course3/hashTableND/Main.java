package ru.vsuet.course3.hashTableND;

public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        // Добавление элементов в хеш-таблицу
        hashTable.put("apple", 1);
        hashTable.put("banana", 2);
        hashTable.put("orange", 3);

        // Получение значений по ключам
        System.out.println(hashTable.get("apple"));   // Выводит: 1
        System.out.println(hashTable.get("banana"));  // Выводит: 2
        System.out.println(hashTable.get("orange"));  // Выводит: 3

        // Удаление элемента по ключу
        hashTable.remove("banana");

        // Проверка размера хеш-таблицы
        System.out.println(hashTable.size());         // Выводит: 2
    }
}

package ru.vsuet.course3.hashTableVK;

import java.util.NoSuchElementException;

public class HashTable<T> {
    private final int INITIAL_CAPACITY = 8;
    private final double LOAD_FACTOR = 0.9;

    private Object[] table; // Массив для хранения записей
    private int size;

    public HashTable() {
        table = new Object[INITIAL_CAPACITY]; // Создание массива с начальной емкостью
        size = 0;
    }

    // Хеширование ключа для определения индекса массива
    private int hash(T key) {
        int hashCode = key.hashCode();
        int index = (hashCode ^ (hashCode >>> 16)) % table.length;
        return index >= 0 ? index : -index;
    }

    private void resize() {
        Object[] newTable = new Object[table.length * 2]; // Создание нового массива с увеличенной емкостью
        for (Object entry : table) {
            if (entry != null) {
                Entry<T> curr = (Entry<T>) entry;
                int index = hash(curr.key);
                newTable[index] = new Entry<>(curr.key, curr.value); // Перехеширование и добавление записей в новый массив
            }
        }
        table = newTable; // Замена старого массива новым
    }

    public void put(T key) {
        if ((double) size / table.length >= LOAD_FACTOR) {
            resize();
        }

        int index = hash(key); // Определение индекса массива
        Entry<T> curr = (Entry<T>) table[index];
        while (curr != null) {
            if (curr.key.equals(key)) {
                return; // Если ключ уже существует в хеш-таблице, завершаем операцию
            }
            curr = curr.next;
        }

        Entry<T> newEntry = new Entry<>(key); // Создание новой записи
        newEntry.next = (Entry<T>) table[index]; // Присоединение новой записи к началу списка
        table[index] = newEntry; // Обновление ячейки массива
        size++;
    }

    public boolean remove(T key) {
        int index = hash(key); // Определение индекса массива
        Entry<T> curr = (Entry<T>) table[index];
        if (curr == null) {
            return false; // Если ячейка пуста, элемент не найден
        }
        if (curr.key.equals(key)) {
            table[index] = curr.next; // Если удаляемая запись первая в списке, обновляем ячейку массива
            size--;
            return true;
        }
        while (curr.next != null) {
            if (curr.next.key.equals(key)) {
                curr.next = curr.next.next; // Удаление записи путем переустановки ссылок
                size--;
                return true;
            }
            curr = curr.next;
        }
        return false; // Элемент не найден
    }

    public T get(T key) {
        int index = hash(key); // Определение индекса массива
        Entry<T> curr = (Entry<T>) table[index];
        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.key; // Если найдена запись с искомым ключом, возвращаем ключ
            }
            curr = curr.next;
        }
        throw new NoSuchElementException("Такой ключ не найден"); // Если элемент не найден, генерируем исключение
    }

    // Внутренний класс для представления записи в хеш-таблице
    private static class Entry<T> {
        T key;
        T value;
        Entry<T> next; // Ссылка на следующую запись в случае коллизии

        public Entry(T key) {
            this.key = key;
        }

        public Entry(T key, T value) {
            this.key = key;
            this.value = value;
        }
    }
}

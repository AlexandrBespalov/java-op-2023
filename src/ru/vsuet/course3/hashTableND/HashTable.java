package ru.vsuet.course3.hashTableND;

import java.util.LinkedList;

public class HashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] table; // Статический массив для хранения связных списков
    private int size; // Количество элементов в хеш-таблице

    public HashTable() {
        table = new LinkedList[DEFAULT_CAPACITY]; // Создание массива заданной начальной емкости
        size = 0; // Изначально хеш-таблица пуста
    }

    public void put(K key, V value) {
        int index = getIndex(key); // Получение индекса в массиве для заданного ключа
        if (table[index] == null) {
            table[index] = new LinkedList<>(); // Если связный список не существует, создаем его
        }

        LinkedList<Entry<K, V>> bucket = table[index]; // Получение связного списка из массива
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) { // Если ключ уже существует, обновляем значение
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new Entry<>(key, value)); // Добавление новой записи в связный список
        size++;
    }

    public V get(K key) {
        int index = getIndex(key); // Получение индекса в массиве для заданного ключа
        LinkedList<Entry<K, V>> bucket = table[index]; // Получение связного списка из массива
        if (bucket != null) {
            for (Entry<K, V> entry : bucket) {
                if (entry.getKey().equals(key)) { // Если ключ найден, возвращаем значение
                    return entry.getValue();
                }
            }
        }
        return null; // Если ключ не найден, возвращаем null
    }

    public void remove(K key) {
        int index = getIndex(key); // Получение индекса в массиве для заданного ключа
        LinkedList<Entry<K, V>> bucket = table[index]; // Получение связного списка из массива
        if (bucket != null) {
            for (Entry<K, V> entry : bucket) {
                if (entry.getKey().equals(key)) { // Если ключ найден, удаляем запись
                    bucket.remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    public int size() {
        return size; // Возвращаем количество элементов в хеш-таблице
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode(); // Получение хеш-кода ключа
        return Math.abs(hashCode) % table.length; // Используем операцию % для получения индекса
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}

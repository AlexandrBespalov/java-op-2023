package ru.vsuet.course3.hashTablePL;

import java.util.LinkedList;

public class HashTable<K, V> {
    private static final int DEFAULT_SIZE = 16;

    private LinkedList<Entry<K, V>>[] table;  // Массив связных списков для хранения элементов хеш-таблицы
    private int size;  // Текущий размер хеш-таблицы

    public HashTable() {
        table = new LinkedList[DEFAULT_SIZE];  // Инициализация массива связных списков
        size = 0;  // Изначально хеш-таблица пуста
    }

    public void put(K key, V value) {
        int index = getIndex(key);  // Получение индекса в массиве для указанного ключа
        LinkedList<Entry<K, V>> bucket = table[index];  // Получение связного списка для данного индекса

        if (bucket == null) {
            bucket = new LinkedList<>();  // Если связного списка нет, создаем новый
            table[index] = bucket;  // Сохраняем связный список в массиве
        }

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);  // Если элемент с указанным ключом уже существует, обновляем его значение
                return;
            }
        }

        bucket.add(new Entry<>(key, value));  // Добавляем новый элемент в связный список
        size++;  // Увеличиваем размер хеш-таблицы
    }

    public V get(K key) {
        int index = getIndex(key);  // Получение индекса в массиве для указанного ключа
        LinkedList<Entry<K, V>> bucket = table[index];  // Получение связного списка для данного индекса

        if (bucket != null) {
            for (Entry<K, V> entry : bucket) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();  // Возвращаем значение элемента с указанным ключом
                }
            }
        }

        return null;  // Если элемент не найден, возвращаем null
    }

    public void remove(K key) {
        int index = getIndex(key);  // Получение индекса в массиве для указанного ключа
        LinkedList<Entry<K, V>> bucket = table[index];  // Получение связного списка для данного индекса

        if (bucket != null) {
            for (Entry<K, V> entry : bucket) {
                if (entry.getKey().equals(key)) {
                    bucket.remove(entry);  // Удаляем элемент с указанным ключом из связного списка
                    size--;  // Уменьшаем размер хеш-таблицы
                    return;
                }
            }
        }
    }

    public boolean containsKey(K key) {
        int index = getIndex(key);  // Получение индекса в массиве для указанного ключа
        LinkedList<Entry<K, V>> bucket = table[index];  // Получение связного списка для данного индекса

        if (bucket != null) {
            for (Entry<K, V> entry : bucket) {
                if (entry.getKey().equals(key)) {
                    return true;  // Если элемент с указанным ключом найден, возвращаем true
                }
            }
        }

        return false;  // Если элемент не найден, возвращаем false
    }

    public int size() {
        return size;  // Возвращаем текущий размер хеш-таблицы
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode();  // Получение хеш-кода ключа
        return Math.abs(hashCode) % table.length;  // Преобразование хеш-кода в индекс в пределах размера массива
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

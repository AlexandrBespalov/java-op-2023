package ru.vsuet.course3.hashTableVK;

import java.util.NoSuchElementException;

public class HashTable<K, V> {
    private final int INITIAL_CAPACITY = 8;
    private final double LOAD_FACTOR = 0.9;

    private Entry<K, V>[] table; // Массив для хранения записей
    private int size;

    public HashTable() {
        table = new Entry[INITIAL_CAPACITY]; // Создание массива с начальной емкостью
        size = 0;
    }

    // Хеширование ключа для определения индекса массива
    private int hash(K key) {
        int hashCode = key.hashCode();
        int index = (hashCode ^ (hashCode >>> 16)) % table.length;
        return index >= 0 ? index : -index;
    }

    private void resize() {
        Entry<K, V>[] newTable = new Entry[table.length * 2]; // Создание нового массива с увеличенной емкостью
        for (Entry<K, V> entry : table) {
            if (entry != null) {
                Entry<K, V> curr = entry;
                int index = hash(curr.key);
                while (newTable[index] != null) {
                    index = (index + 1) % newTable.length; // Линейное пробирование при коллизии
                }
                newTable[index] = new Entry<>(curr.key, curr.value); // Перехеширование и добавление записей в новый массив
            }
        }
        table = newTable; // Замена старого массива новым
    }

    public void put(K key, V value) {
        if ((double) size / table.length >= LOAD_FACTOR) {
            resize();
        }

        int index = hash(key); // Определение индекса массива
        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                table[index].value = value; // Если ключ уже существует в хеш-таблице, обновляем значение
                return;
            }
            index = (index + 1) % table.length; // Линейное пробирование при коллизии
        }

        table[index] = new Entry<>(key, value); // Создание новой записи
        size++;
    }

    public boolean remove(K key) {
        int index = hash(key); // Определение индекса массива
        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                table[index] = null; // Удаление записи
                size--;
                rehash(); // Перехеширование оставшихся записей в случае, если они были сдвинуты
                return true;
            }
            index = (index + 1) % table.length; // Линейное пробирование при коллизии
        }
        return false; // Элемент не найден
    }

    private void rehash() {
        Entry<K, V>[] tempTable = table;
        table = new Entry[INITIAL_CAPACITY]; // Создание нового массива
        size = 0;
        for (Entry<K, V> entry : tempTable) {
            if (entry != null) {
                put(entry.key, entry.value); // Перехеширование и добавление записей в новый массив
            }
        }
    }

    public V get(K key) {
        int index = hash(key); // Определение индекса массива
        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                return table[index].value; // Если найдена запись с искомым ключом, возвращаем значение
            }
            index = (index + 1) % table.length; // Линейное пробирование при коллизии
        }
        throw new NoSuchElementException("Такой ключ не найден"); // Если элемент не найден, генерируем исключение
    }

    // Внутренний класс для представления записи в хеш-таблице
    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

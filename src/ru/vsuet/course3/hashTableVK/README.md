## Хеш-таблица (Hash Table)

Хеш-таблица представляет собой реализацию структуры данных, которая обеспечивает эффективное хранение и быстрый доступ к элементам по ключу. Она использует хеширование для преобразования ключа в индекс массива, что позволяет получать доступ к элементам почти за константное время.

**Содержание:**

1. [Введение](#введение)
2. [Описание программы](#описание-программы)
3. [Классы и методы](#классы-и-методы)
   - [HashTable\<K, V\>](#hashtablek-v)
      - [put(K key, V value)](#putk-key-v-value)
      - [remove(K key)](#removek-key)
      - [get(K key)](#getk-key)
   - [Entry\<K, V\>](#entryk-v)
4. [Пример работы программы](#пример-работы-программы)

### Введение

Хеш-таблица является важной структурой данных, которая широко применяется для эффективного поиска и хранения данных. Она использует хеширование для преобразования ключа в индекс массива, что позволяет ускорить операции добавления, поиска и удаления элементов. Хеш-таблицы находят применение в различных областях, включая базы данных, кэширование, поисковые системы и другие.

### Описание программы

Данная программа реализует хеш-таблицу в виде класса `HashTable`. Она позволяет добавлять элементы с уникальными ключами и связанными с ними значениями, получать значения элементов по ключу, удалять элементы по ключу. Хеш-таблица автоматически изменяет свой размер при достижении определенного коэффициента заполнения, чтобы обеспечить эффективность операций.

### Классы и методы

#### HashTable\<K, V\>

Главный класс, реализующий хеш-таблицу.

##### Методы:

- `put(K key, V value)` - добавляет элемент с указанным ключом и связанным с ним значением в хеш-таблицу.
- `remove(K key)` - удаляет элемент с указанным ключом из хеш-таблицы.
- `get(K key)` - возвращает значение элемента по указанному ключу.

#### Entry\<K, V\>

Внутренний класс, представляющий запись (элемент) в хеш-таблице.

##### Поля:

- `key` - ключ элемента.
- `value` - значение элемента.

### Пример работы программы

```java
package ru.vsuet.course3.hashTableVK;

import java.util.NoSuchElementException;

public class Main {
    public static void

 main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        // Добавление элементов
        hashTable.put("key1", 1);
        hashTable.put("key2", 2);
        hashTable.put("key3", 3);

        // Получение элемента
        Integer value1 = hashTable.get("key1");
        System.out.println("Значение key1: " + value1);

        // Удаление элемента
        boolean removed = hashTable.remove("key2");
        System.out.println("Удаление key2: " + removed);

        // Попытка получить удаленный элемент
        try {
            Integer value2 = hashTable.get("key2");
            System.out.println("Значение key2: " + value2);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

Вывод программы:

```
Значение key1: 1
Удаление key2: true
Такой ключ не найден
```
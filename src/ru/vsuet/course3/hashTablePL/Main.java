package ru.vsuet.course3.hashTablePL;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра хеш-таблицы
        HashTable<String, Integer> table = new HashTable<>();

        // Добавление элементов в хеш-таблицу
        table.put("яблоко", 10);
        table.put("банан", 20);
        table.put("вишня", 30);
        table.put("дыня", 40);
        table.put("ежевика", 50);
        table.put("финик", 60);

        // Вывод размера хеш-таблицы
        System.out.println("Размер хеш-таблицы: " + table.size());

        // Получение значения по ключу
        System.out.println("Значение для 'яблоко': " + table.get("яблоко"));
        System.out.println("Значение для 'вишня': " + table.get("вишня"));

        // Удаление элемента по ключу
        table.remove("банан");

        // Проверка наличия ключа
        System.out.println("Размер хеш-таблицы после удаления: " + table.size());
        System.out.println("Содержит ключ 'банан': " + table.containsKey("банан"));

        // Добавление нового элемента
        table.put("виноград", 70);
        System.out.println("Значение для 'авокадо': " + table.get("авокадо"));
    }
}

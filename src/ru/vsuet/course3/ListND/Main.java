package ru.vsuet.course3.ListND;

public class Main {
    public static void main(String[] args) {
        // Создание объекта LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Добавление элементов в список
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);

        // Проверка наличия элемента
        System.out.println("Список содержит элемент со значением 10: " + linkedList.contains(10));
        System.out.println("Список содержит элемент со значением 20: " + linkedList.contains(20));

        // Удаление элемента
        linkedList.remove(10);

        // Проверка наличия элемента после удаления
        System.out.println("Список содержит элемент со значением 10: " + linkedList.contains(10));
    }
}
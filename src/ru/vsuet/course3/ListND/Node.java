package ru.vsuet.course3.ListND;

// Класс представляющий узел списка
class Node<T> {
    T data; // Данные узла
    Node<T> next; // Ссылка на следующий узел

    // Конструктор
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
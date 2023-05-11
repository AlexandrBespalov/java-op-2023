package ru.vsuet.course3.ListSA;

class Node {
    int data;   // Значение узла
    Node next;  // Ссылка на следующий узел

    // Конструктор узла
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
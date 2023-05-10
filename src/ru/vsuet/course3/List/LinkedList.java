package ru.vsuet.course3.List;

// Создаем класс односвязного списка
class LinkedList {
    Node head;  // Головной узел списка (первый узел)

    // Конструктор списка
    public LinkedList() {
        this.head = null;
    }

    // Метод для добавления элемента в конец списка
    public void append(int data) {
        Node newNode = new Node(data);

        // Если список пустой, новый узел становится головным
        if (head == null) {
            head = newNode;
        } else {
            // Иначе, находим последний узел и добавляем новый узел после него
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Метод для удаления элемента из списка
    public void delete(int data) {
        // Если головной узел содержит значение для удаления
        if (head != null && head.data == data) {
            head = head.next;
        } else {
            // Иначе, находим узел для удаления и удаляем его
            Node current = head;
            Node prev = null;

            while (current != null && current.data != data) {
                prev = current;
                current = current.next;
            }

            if (current != null) {
                prev.next = current.next;
            }
        }
    }

    // Метод для отображения содержимого списка
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
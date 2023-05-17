package ru.vsuet.course2.LinkedListApp;

import java.util.function.Predicate;

public class LinkedList implements List {
    private Node head; // Головной узел списка

    private class Node {
        int value; // Значение узла
        Node next; // Ссылка на следующий узел

        Node(int value) {
            this.value = value;
        }
    }

    @Override
    public void add(int value) {
        if (head == null) {
            head = new Node(value); // Если список пуст, создаем новый узел и делаем его головным
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value); // Ищем последний узел и добавляем новый узел после него
        }
    }

    @Override
    public void add(int index, int value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Индекс не может быть отрицательным");
        }

        if (index == 0) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode; // Вставляем новый узел в начало списка и делаем его головным
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) {
                    throw new IndexOutOfBoundsException("Индекс выходит за пределы");
                }
                current = current.next;
            }

            if (current == null) {
                throw new IndexOutOfBoundsException("Индекс выходит за пределы");
            }

            Node newNode = new Node(value);
            newNode.next = current.next;
            current.next = newNode; // Вставляем новый узел между текущим и следующим узлом
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы");
        }

        if (index == 0) {
            head = head.next; // Удаляем головной узел и делаем следующий узел новым головным
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null || current.next == null) {
                    throw new IndexOutOfBoundsException("Индекс выходит за пределы");
                }
                current = current.next;
            }

            if (current.next == null) {
                throw new IndexOutOfBoundsException("Индекс выходит за пределы");
            }

            current.next = current.next.next; // Удаляем узел, перенаправляя ссылку на следующий узел
        }
    }

    @Override
    public void remove(Predicate<Integer> condition) {
        if (head == null) {
            return; // Если список пуст, ничего не делаем
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (condition.test(current.value)) {
                if (prev == null) {
                    head = current.next; // Удаляем головной узел
                } else {
                    prev.next = current.next; // Удаляем текущий узел путем перенаправления ссылки предыдущего узла
                }
            } else {
                prev = current; // Переходим к следующему узлу
            }
            current = current.next;
        }
    }

    @Override
    public int get(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Индекс выходит за пределы");
            }
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы");
        }

        return current.value; // Возвращаем значение текущего узла
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ILinkedList{");

        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }

        sb.append("}");
        return sb.toString();
    }
}

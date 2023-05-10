package ru.vsuet.course2.list;

public class  DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public boolean delete(T data) {
        Node<T> curr = head;

        while (curr != null && !curr.data.equals(data)) {
            curr = curr.next;
        }

        if (curr == null) {
            return false;
        }

        if (curr.prev == null) {
            head = curr.next;
        } else {
            curr.prev.next = curr.next;
        }

        if (curr.next == null) {
            tail = curr.prev;
        } else {
            curr.next.prev = curr.prev;
        }

        size--;
        return true;
    }

    public boolean update(T oldData, T newData) {
        Node<T> curr = head;
        while (curr != null) {
            if (curr.data.equals(oldData)) {
                curr.data = newData;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node<T> curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.data;
    }

}

package ru.vsuet.course2.hashTable;

import java.util.NoSuchElementException;

public class HashTable<T> {
    private final int INITIAL_CAPACITY = 16;
    private final double LOAD_FACTOR = 0.75;

    private ListNode<T>[] table;
    private int size;

    public HashTable() {
        table = new ListNode[INITIAL_CAPACITY];
        size = 0;
    }

    private int hash(T key) {
        return key.hashCode() % table.length;
    }

    private void resize() {
        ListNode<T>[] newTable = new ListNode[table.length * 2];
        for (int i = 0; i < table.length; i++) {
            ListNode<T> curr = table[i];
            while (curr != null) {
                int index = hash(curr.data);
                ListNode<T> newNode = new ListNode<>(curr.data);
                newNode.next = newTable[index];
                newTable[index] = newNode;
                curr = curr.next;
            }
        }
        table = newTable;
    }

    public void put(T key) {
        if ((double) size / table.length >= LOAD_FACTOR) {
            resize();
        }

        int index = hash(key);
        ListNode<T> curr = table[index];
        while (curr != null) {
            if (curr.data.equals(key)) {
                return;
            }
            curr = curr.next;
        }

        ListNode<T> newNode = new ListNode<>(key);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }

    public boolean remove(T key) {
        int index = hash(key);
        ListNode<T> curr = table[index];
        if (curr == null) {
            return false;
        }
        if (curr.data.equals(key)) {
            table[index] = curr.next;
            size--;
            return true;
        }
        while (curr.next != null) {
            if (curr.next.data.equals(key)) {
                curr.next = curr.next.next;
                size--;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public T get(T key) {
        int index = hash(key);
        ListNode<T> curr = table[index];
        while (curr != null) {
            if (curr.data.equals(key)) {
                return curr.data;
            }
            curr = curr.next;
        }
        throw new NoSuchElementException("Key not found");
    }

    private static class ListNode<T> {
        T data;
        ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }
}


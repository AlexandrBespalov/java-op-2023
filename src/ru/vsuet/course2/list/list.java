package ru.vsuet.course2.list;

public class list<T>{
    private ListNode<T> head;

    private static class ListNode<T> {
        T data;
        ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        ListNode<T> newNode = new ListNode<>(data);

        if (head == null) {
            head = newNode;
        } else {
            ListNode<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public boolean delete(T data) {
        if (head == null) {
            return false;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return true;
        }

        ListNode<T> curr = head;
        while (curr.next != null) {
            if (curr.next.data.equals(data)) {
                curr.next = curr.next.next;
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public boolean update(T oldData, T newData) {
        ListNode<T> curr = head;
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
        ListNode<T> curr = head;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }
        return curr == null ? null : curr.data;
    }

}

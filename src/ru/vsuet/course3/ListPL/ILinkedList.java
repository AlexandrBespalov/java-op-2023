package ru.vsuet.course3.ListPL;

import java.util.function.Predicate;

public class ILinkedList implements IList {

    private Node head; // Комментарий: Головной узел списка

    // Комментарий: Класс Node представляет узел списка
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            // Комментарий: Если список пуст, новый узел становится головным узлом
            head = newNode;
        } else {
            // Комментарий: Если список не пуст, находим последний узел и добавляем новый узел после него
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public void add(int index, int value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        if (index == 0) {
            // Комментарий: Если индекс равен 0, новый узел становится головным узлом,
            // а предыдущий головной узел становится следующим узлом нового узла
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        } else {
            // Комментарий: Если индекс больше 0, находим узел по индексу - 1
            // и вставляем новый узел после него, устанавливая ссылки на следующие узлы
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) {
                    throw new IndexOutOfBoundsException("Index out of bounds");
                }
                current = current.next;
            }
            Node newNode = new Node(value);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        if (index == 0) {
            // Комментарий: Если индекс равен 0, удаляем головной узел и делаем следующий узел новым головным узлом
            if (head == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            head = head.next;
        } else {
            // Комментарий: Если индекс больше 0, находим узел по индексу - 1
            // и изменяем ссылки, чтобы пропустить удаляемый узел
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null || current.next == null) {
                    throw new IndexOutOfBoundsException("Index out of bounds");
                }
                current = current.next;
            }
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current.next = current.next.next;
        }
    }

    @Override
    public void remove(Predicate<Integer> condition) {
        Node current = head;
        Node previous = null;

        // Комментарий: Обходим список и удаляем узлы, удовлетворяющие условию
        while (current != null) {
            if (condition.test(current.value)) {
                if (previous == null) {
                    // Комментарий: Если удаляемый узел - головной, делаем следующий узел новым головным
                    head = current.next;
                } else {
                    // Комментарий: Иначе, изменяем ссылки, чтобы пропустить удаляемый узел
                    previous.next = current.next;
                }
            } else {
                previous = current;
            }
            current = current.next;
        }
    }

    @Override
    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        // Комментарий: Находим узел по индексу и возвращаем его значение
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        return current.value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = head;
        builder.append("ILinkedList{");

        // Комментарий: Создаем строковое представление списка в формате "value1 -> value2 -> ..."
        while (current != null) {
            builder.append(current.value);
            if (current.next != null) {
                builder.append(" -> ");
            }
            current = current.next;
        }

        builder.append("}");
        return builder.toString();
    }
}

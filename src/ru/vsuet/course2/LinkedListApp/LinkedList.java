package ru.vsuet.course2.LinkedListApp;

public class LinkedList<T> {
    private Node<T> head; // Голова списка

    /**
     * Метод для добавления элемента в конец списка.
     *
     * @param data данные элемента
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data); // Создание нового узла с переданными данными

        if (head == null) { // Если список пустой, новый узел становится головой списка
            head = newNode;
        } else {
            Node<T> current = head;

            // Перебор списка до последнего элемента
            while (current.getNext() != null) {
                current = current.getNext();
            }

            // Добавление нового узла в конец списка
            current.setNext(newNode);
        }
    }

    /**
     * Метод для удаления первого вхождения элемента из списка.
     *
     * @param data данные элемента
     * @return true, если элемент был найден и удален, false в противном случае
     */
    public boolean remove(T data) {
        if (head == null) { // Если список пустой, возвращается false
            return false;
        }

        if (head.getData().equals(data)) { // Если элемент является головой списка, голова переносится на следующий элемент
            head = head.getNext();
            return true;
        }

        Node<T> current = head;

        // Перебор списка для поиска элемента
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(data)) {
                // Установка ссылки на следующий элемент, пропуская таким образом удаляемый элемент
                current.setNext(current.getNext().getNext());
                return true;
            }
            current = current.getNext();
        }

        return false; // Элемент не был найден в списке
    }

    /**
     * Метод для проверки наличия элемента в списке.
     *
     * @param data данные элемента
     * @return true, если элемент найден в списке, false в противном случае
     */
    public boolean contains(T data) {
        Node<T> current = head;

        // Перебор списка для поиска элемента
        while (current != null) {
            if (current.getData().equals(data)) {
                return true; // Элемент найден в списке
            }
            current = current.getNext();
        }

        return false; // Элемент не найден в списке
    }

    /**
     * Метод для вывода содержимого списка.
     */
    public void printList() {
        Node<T> current = head;

        // Перебор списка и вывод элементов
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }

        System.out.println();
    }

    /**
     * Вложенный класс, представляющий узел списка.
     *
     * @param <T> тип данных элемента
     */
    private static class Node<T> {
        private T data; // Данные элемента
        private Node<T> next; // Ссылка на следующий узел

        /**
         * Конструктор класса Node.
         *
         * @param data данные элемента
         */
        public Node(T data) {
            this.data = data;
        }

        /**
         * Метод для получения данных элемента.
         *
         * @return данные элемента
         */
        public T getData() {
            return data;
        }

        /**
         * Метод для получения ссылки на следующий узел.
         *
         * @return ссылка на следующий узел
         */
        public Node<T> getNext() {
            return next;
        }

        /**
         * Метод для установки ссылки на следующий узел.
         *
         * @param next ссылка на следующий узел
         */
        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
package ru.vsuet.course3.ListND;

class LinkedList<T> {
    private Node<T> head; // Головной узел списка

    /**
     * Конструктор класса LinkedList.
     * Инициализирует пустой список.
     */
    public LinkedList() {
        this.head = null;
    }

    /**
     * Метод для добавления элемента в конец списка.
     *
     * @param data Данные элемента.
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            // Если список пуст, новый узел становится головным узлом
            head = newNode;
        } else {
            // Иначе находим последний узел и добавляем новый узел после него
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /**
     * Метод для удаления элемента из списка.
     *
     * @param data Данные элемента для удаления.
     */
    public void remove(T data) {
        if (head == null) {
            // Если список пуст, просто возвращаемся
            return;
        }

        if (head.data.equals(data)) {
            // Если головной узел содержит искомые данные, переустанавливаем головной узел на следующий узел
            head = head.next;
            return;
        }

        Node<T> current = head;
        Node<T> prev = null;
        while (current != null && !current.data.equals(data)) {
            // Поиск узла с искомыми данными и сохранение предыдущего узла
            prev = current;
            current = current.next;
        }

        if (current != null) {
            // Если узел с искомыми данными найден, связываем предыдущий узел с следующим узлом, пропуская текущий узел
            assert prev != null;
            prev.next = current.next;
        }
    }

    /**
     * Метод для проверки наличия элемента в списке.
     *
     * @param data Данные элемента для проверки.
     * @return true, если элемент присутствует в списке, иначе false.
     */
    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            // Проверка каждого узла на совпадение с искомыми данными
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

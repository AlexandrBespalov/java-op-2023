package ru.vsuet.course3.List;

// Пример использования
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Добавляем элементы в список
        list.append(10);
        list.append(20);
        list.append(30);

        // Отображаем содержимое списка
        list.display();  // Вывод: 10 20 30

        // Удаляем элемент из списка
        list.delete(20);

        // Отображаем обновленное содержимое списка
        list.display();  // Вывод: 10 30
    }
}
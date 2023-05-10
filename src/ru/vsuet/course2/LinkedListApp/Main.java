package ru.vsuet.course2.LinkedListApp;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.printList(); // Вывод: 10 20 30

        System.out.println("Contains 20: " + list.contains(20)); // Вывод: Contains 20: true
        System.out.println("Contains 40: " + list.contains(40)); // Вывод: Contains 40: false

        list.remove(20);
        list.printList(); // Вывод: 10 30
    }
}
package ru.vsuet.course2.LinkedListApp;

public class Main {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.add(0, 0);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);

        list.remove((x) -> x > 50);

        System.out.println("Element with index 1 is " + list.get(1));
    }
}

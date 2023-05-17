package ru.vsuet.course2.LinkedListApp;

import java.util.function.Predicate;

public interface List {
    void add(int value);

    void add(int index, int value);

    void remove(int index);

    void remove(Predicate<Integer> condition);

    int get(int index);
}
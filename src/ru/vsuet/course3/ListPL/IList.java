package ru.vsuet.course3.ListPL;

import java.util.function.Predicate;

public interface IList {

    void add(int value);

    void add(int index, int value);

    void remove(int index);

    void remove(Predicate<Integer> condition);

    int get(int index);
}

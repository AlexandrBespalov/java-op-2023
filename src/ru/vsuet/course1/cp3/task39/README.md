Напишите программу, которая принимает целое положительное число и возвращает следующее большее число, которое можно составить, переставляя его цифры. В случае если перестановка чисел не принесет результата вернуть -1 Пример:
~~~
23 ==> 32
523 ==> 532
2018 ==> 2081
1 ==> -1
532 ==> -1
~~~

---

Основная идея заключается в том, чтобы найти первую пару чисел, где левое число меньше правого, именно это число можно поменять местами с каким-то другим числом из правой части. Затем мы находим наименьшее число, которое больше найденного числа, меняем их местами и переворачиваем оставшуюся часть числа, чтобы получить наименьшее следующее число. Если такого числа не существует, то возвращаем -1.

Для получения массива цифр числа используется метод Integer.toString(num).chars().map(c -> c - '0').toArray().

Arrays.toString(digits).replaceAll("[\\[\\]\\,\\s]", "") используется для преобразования массива обратно в число.
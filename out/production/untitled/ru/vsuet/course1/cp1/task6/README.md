Напишите программу проверяющую что число является простым - делится только на себя и 1. Пример простых чисел: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29….

---

В этом коде мы сначала считываем число, которое нужно проверить, из стандартного ввода с помощью класса Scanner. Затем мы используем цикл for, чтобы проверить, делится ли число на какое-либо другое число, кроме 1 и самого себя.

Мы начинаем с делителя 2 и продолжаем до корня из заданного числа, потому что любой делитель, больший, чем корень из числа, будет иметь пару меньший делитель, который мы уже проверили. Если мы находим делитель, который делит число без остатка, мы устанавливаем флаг isPrime в false и выходим из цикла.

После того, как цикл завершен, мы проверяем значение флага isPrime. Если он равен true, и число больше 1, то это простое число, и мы выводим соответствующее сообщение. В противном случае мы выводим сообщение, что число не является простым.
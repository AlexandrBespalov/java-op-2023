На вход подается число (0 < n > 100000). Число n является разницей между двумя последовательными квадратами числа. Пр. 9 = 25-16, 5 = 9-4, 7 = 16-9.

---

В данном коде мы используем класс Scanner для считывания числа n. Затем мы находим ближайший квадрат числа, меньший чем n, и следующий квадрат числа. Для этого мы используем функцию Math.sqrt для вычисления квадратного корня.

Затем мы находим разницу между двумя последовательными квадратами числа и проверяем, равна ли эта разница заданному числу n. Если это так, мы выводим найденные квадраты чисел на экран. Если разница не равна n, мы выводим сообщение об ошибке.
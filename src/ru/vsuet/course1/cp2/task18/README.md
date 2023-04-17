Напишите программму ищуую во введенном массиве чисел максимальное значение и формирующую два массива - 1) все числа слева от максимума, 2) все числа справа от максимума

---

Программа начинается с объявления и инициализации массива arr с некоторыми целочисленными значениями. Затем в цикле for ищется индекс максимального элемента в массиве. После этого с помощью метода Arrays.copyOfRange создаются два новых массива - leftArray, содержащий все элементы, расположенные слева от максимального значения, и rightArray, содержащий все элементы, расположенные справа от максимального значения. Наконец, результаты выводятся на экран.

Пример вывода:

~~~
Исходный массив: [4, 8, 3, 9, 2, 5, 7, 1, 6]
Максимальный элемент: 9
Элементы слева от максимального: [4, 8, 3]
Элементы справа от максимального: [2, 5, 7, 1, 6]
~~~
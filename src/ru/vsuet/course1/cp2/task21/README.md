Решите проблему нумпад и телефонных клавиатур - необходимо преобразовать ввод чисел с нумпада в состояние набранного со стандартной клавиатуры телефона. Пр. "789" -> "123". На вход подаются только строки чисел.

---

Для решения данной задачи мы можем использовать хэш-таблицу для хранения соответствия между цифрами на нумпаде и цифрами на телефонной клавиатуре. Затем мы будем проходить по входной строке и заменять каждую цифру на соответствующую цифру на телефонной клавиатуре, используя хэш-таблицу.

Здесь мы сначала создаем хэш-таблицу, в которой ключом является цифра на нумпаде, а значением - соответствующая цифра на телефонной клавиатуре. Затем мы проходим по каждой цифре входной строки и заменяем ее на соответствующую цифру на телефонной клавиатуре, используя хэш-таблицу. Наконец, мы возвращаем полученную строку.
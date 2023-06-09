Напишите функцию проверяющую корректность открытых и закрытых скобок. Пр.: () => true, (()()((()))) => true, (((())() => false.

---

Функция check принимает строку str и возвращает true, если все скобки в ней корректно сбалансированы, и false в противном случае.

Алгоритм работы функции заключается в следующем:
~~~
1. Создается пустой стек.
2. Для каждого символа c в строке str выполняются следующие действия:
- Если c - это открывающая скобка ((, [ или {), то она помещается в стек.
- Если c - это закрывающая скобка (), ] или }), то она сравнивается с вершиной стека. Если вершина стека не соответствует открывающей скобке, то функция возвращает false. В противном случае вершина стека удаляется из него.
3. Если стек оказывается пустым после прохода по всей строке, то функция возвращает true. В противном случае возвращается false.
~~~
В функции используется стандартный класс Stack из пакета java.util, который представляет собой стек на основе списка.

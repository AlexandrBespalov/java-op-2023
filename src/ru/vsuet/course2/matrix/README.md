# Программа "Матрица"

Это Java-программа, которая определяет класс "Matrix" и выполняет различные операции с матрицей, используя предоставленный интерфейс "Calculator".

## Содержание
- [Введение](#введение)
- [Класс Matrix](#класс-matrix)
    - [Конструктор](#конструктор)
    - [Метод calculate](#метод-calculate)
    - [Метод toString](#метод-tostring)
    - [Метод fillRandom](#метод-fillrandom)
    - [Метод printMatrix](#метод-printmatrix)
    - [Метод performOperations](#метод-performoperations)
- [Интерфейс Calculator](#интерфейс-calculator)
- [Класс Main](#класс-main)
- [Использование](#использование)

## Введение

Программа состоит из трех файлов Java:
- "Matrix.java": Определяет класс "Matrix", отвечающий за операции с матрицей.
- "Calculator.java": Определяет интерфейс "Calculator" для выполнения вычислений над элементами матрицы.
- "Main.java": Содержит основной метод для демонстрации функциональности программы.

Класс "Matrix" предоставляет методы для создания матрицы, вычисления значений на основе условий и выполнения операций над элементами матрицы.

## Класс Matrix

Класс "Matrix" представляет квадратную матрицу и предоставляет методы для работы с ней.

### Конструктор

#### "Matrix(int size)"

- Инициализирует квадратную матрицу заданного размера.
- Матрица заполняется случайными целочисленными значениями.

### Метод calculate

#### "int calculate(BiFunction<Integer, Integer, Boolean> condition, BiFunction<Integer, Integer, Integer> expression, Integer accumulator)"

- Вычисляет значение на основе заданных условий и выражений.
- Применяет переданные функции "condition" и "expression" к элементам матрицы.
- Функция "condition" определяет, применять ли функцию "expression" к элементу.
- Функция "expression" выполняет вычисления над элементом.
- "accumulator" - начальное значение для вычислений.
- Метод возвращает окончательный результат вычислений.

### Метод toString

#### "String toString()"

- Возвращает строковое представление матрицы.
- Матрица представлена строкой, в которой строки и столбцы разделены запятыми и заключены в квадратные скобки.

### Метод fillRandom

- Заполняет матрицу случайными целочисленными значениями от 0 до 9.

### Метод printMatrix

- Выводит элементы матрицы на консоль.

### Метод performOperations

#### "void performOperations(Calculator calculator)"

- Выполняет операции над матрицей с использованием переданного экземпляра "Calculator".
- Вычисляет сумму элементов выше главной диагонали, разность элементов ниже главной диагонали и произведение элементов на главной диагонали.
- Выводит результаты на консоль.

## Интерфейс Calculator

Интерфейс "Calculator" определяет операции, которые могут выполняться над элементами матрицы.

#### "int calculateSum(int a, int b)"

- Вычисляет сумму двух целых чисел.

#### "int calculateDifference(int a, int b)"

- Вычисляет разность между двумя целыми числами.

#### "int calculateProduct(int a, int b)"

- Вычисляет произведение двух целых чисел.

## Класс Main

Класс "Main" содержит основной метод для выполнения программы.

- Создает экземпляр класса "Matrix" с размером 5.
- Выводит строковое представление матрицы на консоль.
- Вызывает метод "calculate" на экземпляре матрицы для выполнения вычислений на основе различных условий и выражений.
- Выводит результаты вычислений на консоль.

## Использование

Для использования этой программы следуйте следующим шагам:

1. Скомпилируйте Java-файлы:
   ```
   javac ru/vsuet/course2/matrix/*.java
   ```

2. Запустите класс "Main":
   ```
   java ru.vsuet.course2.matrix.Main
   ```

   Программа сгенерирует случайную матрицу и выполнит вычисления над ее элементами на основе заданных условий и выражений. Результаты будут выведены на консоль.

   Примечание: Вы можете раскомментировать строки "printMatrix" и "performOperations" в классе "Main", чтобы увидеть элементы матрицы и подробные вычисления.
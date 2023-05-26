# Калькулятор на Java

Простой калькулятор на Java, который позволяет выполнять различные арифметические операции над числами и сохранять их в файл.

## Использование

1. После запуска программы вы увидите приглашение для ввода математического выражения:

   ```java
   Введите математическое выражение (или 'выход' для завершения):

2. Введите математическое выражение, например:

   ```java
   7 + 3 * |(-2^3 - 4)| % 23 / 2

3. Нажмите Enter. Программа выведет результат вычисления:

   ```java
   Результат: 9.0

4. Продолжайте вводить новые математические выражения или введите "выход", чтобы завершить программу.

## История вычислений

- Все введенные математические выражения и их результаты сохраняются в файле history.csv.
- При следующем запуске программы можно загрузить историю вычислений с помощью команды:
   ```java
   java Main --history
   //Программа выведет список всех предыдущих вычислений.
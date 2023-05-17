package ru.vsuet.course1.cp4;

import java.util.Stack;

public class Calculator {
    // Метод для проверки, является ли символ оператором
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '|' || c == '%';
    }

    // Метод для выполнения операции над двумя числами
    private double executeOperation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
            case '^':
                return Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Неверный оператор: " + operator);
        }
    }

    // Метод для вычисления значения математического выражения
    public double evaluateExpression(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Если текущий символ - цифра, извлекаем число из строки и добавляем в стек чисел
                StringBuilder numBuilder = new StringBuilder();
                numBuilder.append(currentChar);

                // Проверяем следующие символы, чтобы извлечь полное число
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    numBuilder.append(expression.charAt(i + 1));
                    i++;
                }

                double number = Double.parseDouble(numBuilder.toString());
                numbers.push(number);
            } else if (currentChar == '(') {
                // Если текущий символ - открывающая скобка, добавляем ее в стек операторов
                operators.push(currentChar);
            } else if (currentChar == ')') {
                // Если текущий символ - закрывающая скобка, выполняем операции внутри скобок
                while (!operators.isEmpty() && operators.peek() != '(') {
                    char operator = operators.pop();
                    double num2 = numbers.pop();
                    double num1 = numbers.pop();
                    double result = executeOperation(num1, num2, operator);
                    numbers.push(result);
                }

                // Удаляем открывающую скобку из стека операторов
                if (!operators.isEmpty() && operators.peek() == '(') {
                    operators.pop();
                }
            } else if (isOperator(currentChar)) {
                // Если текущий символ - оператор, выполняем операции в зависимости от приоритета
                while (!operators.isEmpty() && getOperatorPriority(operators.peek()) >= getOperatorPriority(currentChar)) {
                    char operator = operators.pop();
                    double num2 = numbers.pop();
                    double num1 = numbers.pop();
                    double result = executeOperation(num1, num2, operator);
                    numbers.push(result);
                }

                // Добавляем текущий оператор в стек операторов
                operators.push(currentChar);
            }
        }

        // Выполняем оставшиеся операции
        while (!operators.isEmpty()) {
            char operator = operators.pop();
            double num2 = numbers.pop();
            double num1 = numbers.pop();
            double result = executeOperation(num1, num2, operator);
            numbers.push(result);
        }

        // Возвращаем конечный результат
        return numbers.pop();
    }

    // Метод для определения приоритета оператора
    private int getOperatorPriority(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
            case '|':
                return 3;
            default:
                return 0;
        }
    }
}

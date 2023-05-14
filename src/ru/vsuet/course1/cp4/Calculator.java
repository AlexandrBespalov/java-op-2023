package ru.vsuet.course1.cp4;

public class Calculator {
    public static double calculate(String equation) {
        // Разбиение уравнения на операнды и операции
        String[] tokens = equation.split(" ");
        // Инициализация результата
        double result = Double.parseDouble(tokens[0]);

        // Вычисление уравнения
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double operand = Double.parseDouble(tokens[i + 1]);

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                case "//":
                    result /= operand;
                    result = (int) result; // Преобразование результата к целому числу
                    break;
                case "%":
                    result %= operand;
                    break;
                case "^":
                    result = Math.pow(result, operand);
                    break;
                case "|":
                    result = Math.abs(operand);
                    break;
            }
        }

        return result;
    }
}

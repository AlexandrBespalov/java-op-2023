package ru.vsuet.course1.cp4;

import java.util.List;


public class Main {
    //TODO
    public static void main(String[] args) {
        // Пример вычисления уравнения и сохранения его в файл
        String equationString = "7 + 3 * Math.abs(Math.pow((-2), 3) - 4) % 23 / 2";
        double result = Calculator.calculate(equationString);

        Equation equation = new Equation(equationString, result);
        FileHandler.saveEquation(equation);

        // Пример загрузки ранее посчитанных уравнений из файла
        List<Equation> equations = FileHandler.loadEquations();

        // Вывод истории уравнений
        System.out.println("История ранее посчитанных уравнений:");
        for (Equation eq : equations) {
            System.out.println(eq.getEquation() + " = " + eq.getResult());
        }
    }
}

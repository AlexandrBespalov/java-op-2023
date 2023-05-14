package ru.vsuet.course1.cp4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String FILE_PATH = "equations.txt";

    public static void saveEquation(Equation equation) {
        try (FileWriter fileWriter = new FileWriter(FILE_PATH, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String equationString = equation.getEquation();
            double result = equation.getResult();

            bufferedWriter.write(equationString + " = " + result);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении уравнения: " + e.getMessage());
        }
    }

    public static List<Equation> loadEquations() {
        List<Equation> equations = new ArrayList<>();

        try (FileReader fileReader = new FileReader(FILE_PATH);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] equationData = line.split(" = ");
                String equationString = equationData[0];
                double result = Double.parseDouble(equationData[1]);

                Equation equation = new Equation(equationString, result);
                equations.add(equation);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке уравнений: " + e.getMessage());
        }

        return equations;
    }
}

package ru.vsuet.course1.cp4;

public class Equation {
    private String equation;
    private double result;

    public Equation(String equation, double result) {
        this.equation = equation;
        this.result = result;
    }

    public String getEquation() {
        return equation;
    }

    public double getResult() {
        return result;
    }
}

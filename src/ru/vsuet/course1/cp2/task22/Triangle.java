package ru.vsuet.course1.cp2.task22;

public class Triangle {
    public double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    Triangle triangle = new Triangle();
    double area = triangle.calculateArea(3, 4, 5); // Returns 6

}


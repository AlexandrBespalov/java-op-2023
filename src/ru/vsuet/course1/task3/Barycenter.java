package ru.vsuet.course1.task3;

public class Barycenter {
    public static void main(String[] args) {
        // координаты вершин треугольника
        double[] A = {4, 6};
        double[] B = {12, 4};
        double[] C = {10, 10};

        // координаты медиан треугольника
        double[] D = {(A[0] + B[0]) / 2, (A[1] + B[1]) / 2};
        double[] E = {(B[0] + C[0]) / 2, (B[1] + C[1]) / 2};
        double[] F = {(C[0] + A[0]) / 2, (C[1] + A[1]) / 2};

        // координаты барицентра треугольника
        double[] G = {(D[0] + E[0] + F[0]) / 3, (D[1] + E[1] + F[1]) / 3};

        // вывод результатов
        System.out.printf("{%.4f, %.4f}", G[0], G[1]);
    }
}


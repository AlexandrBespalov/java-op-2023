package ru.vsuet.course1.cp2.task30;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] l = {50, 55, 57, 58, 60};
        int maxDist = 175;
        int numCities = 3;

        ArrayList<int[]> combinations = getCombinations(l, numCities);
        int maxSum = -1;
        for (int[] combo : combinations) {
            int sum = Arrays.stream(combo).sum();
            if (sum <= maxDist && sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }

    private static ArrayList<int[]> getCombinations(int[] arr, int n) {
        ArrayList<int[]> res = new ArrayList<>();
        int[] combo = new int[n];
        combinationsHelper(res, arr, combo, 0, 0);
        return res;
    }

    private static void combinationsHelper(ArrayList<int[]> res, int[] arr, int[] combo, int index, int start) {
        if (index == combo.length) {
            res.add(Arrays.copyOf(combo, combo.length));
        } else {
            for (int i = start; i < arr.length; i++) {
                combo[index] = arr[i];
                combinationsHelper(res, arr, combo, index + 1, i + 1);
            }
        }
    }
}

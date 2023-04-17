package ru.vsuet.course1.cp3.task42;

public class IntervalCounter {
    public static int countIntervals(int[][] intervals) {
        int count = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            int end = intervals[i][1];
            int startNext = intervals[i + 1][0];
            count += startNext - end - 1;
        }
        return count;
    }
}

package ru.vsuet.course1.cp3.task40;

import java.util.ArrayList;
import java.util.List;

public class RangeFormatter {
    public static String formatRange(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int start = nums[0];
        int end = start;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end++;
            } else {
                ranges.add(format(start, end));
                start = end = nums[i];
            }
        }
        ranges.add(format(start, end));

        return String.join(",", ranges);
    }

    private static String format(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "-" + end;
        }
    }
}

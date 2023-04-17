package ru.vsuet.course1.cp3.task41;

public class TimeCalculator {
    public static String convertSecondsToTime(long seconds) {
        if (seconds < 0) {
            return "Отрицательное время недопустимо";
        } else if (seconds == 0) {
            return "0 секунд";
        } else {
            long hours = seconds / 3600;
            long minutes = (seconds % 3600) / 60;
            long remainingSeconds = seconds % 60;

            StringBuilder result = new StringBuilder();
            if (hours > 0) {
                result.append(hours).append(hours == 1 ? " час" : " часов").append(", ");
            }
            if (minutes > 0) {
                result.append(minutes).append(minutes == 1 ? " минуту" : " минут").append(" и ");
            }
            result.append(remainingSeconds).append(remainingSeconds == 1 ? " секунду" : " секунды");

            return result.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(convertSecondsToTime(62)); // Выведет "1 минуту и 2 секунды"
        System.out.println(convertSecondsToTime(3662)); // Выведет "1 час, 1 минуту и 2 секунды"
    }
}

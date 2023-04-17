package ru.vsuet.course1.cp3.task41;

public class TimeCalculator {
    private static final int YEAR = 365 * 24 * 60 * 60;
    private static final int MONTH = 30 * 24 * 60 * 60;
    private static final int WEEK = 7 * 24 * 60 * 60;
    private static final int DAY = 24 * 60 * 60;
    private static final int HOUR = 60 * 60;
    private static final int MINUTE = 60;

    public static String calculateTime(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Время не может быть отрицательным");
        }

        if (seconds == 0) {
            return "0 секунд";
        }

        int years = seconds / YEAR;
        seconds -= years * YEAR;
        int months = seconds / MONTH;
        seconds -= months * MONTH;
        int weeks = seconds / WEEK;
        seconds -= weeks * WEEK;
        int days = seconds / DAY;
        seconds -= days * DAY;
        int hours = seconds / HOUR;
        seconds -= hours * HOUR;
        int minutes = seconds / MINUTE;
        seconds -= minutes * MINUTE;

        StringBuilder sb = new StringBuilder();
        if (years > 0) {
            sb.append(years).append(" ").append(formatWord(years, "год", "года", "лет"));
        }
        if (months > 0) {
            appendDelimiter(sb);
            sb.append(months).append(" ").append(formatWord(months, "месяц", "месяца", "месяцев"));
        }
        if (weeks > 0) {
            appendDelimiter(sb);
            sb.append(weeks).append(" ").append(formatWord(weeks, "неделя", "недели", "недель"));
        }
        if (days > 0) {
            appendDelimiter(sb);
            sb.append(days).append(" ").append(formatWord(days, "день", "дня", "дней"));
        }
        if (hours > 0) {
            appendDelimiter(sb);
            sb.append(hours).append(" ").append(formatWord(hours, "час", "часа", "часов"));
        }
        if (minutes > 0) {
            appendDelimiter(sb);
            sb.append(minutes).append(" ").append(formatWord(minutes, "минута", "минуты", "минут"));
        }
        if (seconds > 0) {
            appendDelimiter(sb);
            sb.append(seconds).append(" ").append(formatWord(seconds, "секунда", "секунды", "секунд"));
        }

        return sb.toString();
    }

    private static void appendDelimiter(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
    }

    private static String formatWord(int number, String form1, String form2, String form5) {
        if (number % 10 == 1 && number % 100 != 11) {
            return form1;
        } else if (number % 10 >= 2 && number % 10 <= 4 && (number % 100 < 10 || number % 100 >= 20)) {
            return form2;
        } else {
            return form5;
        }
    }
}

package by.bntu.fitr.labs.lab4.module.logic;

public class Algorithms {

    public static <T extends Comparable<T>> T findMax(T... arr) {
        if (arr.length == 0) {
            throw new IllegalStateException("Array length can not be zero.");
        }

        T max = arr[0];
        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }

    public static boolean isMultipleOfNumbers(int num, int... numbers) {
        if (num == 0) {
            return false;
        }

        boolean result = true;

        for (int number : numbers) {
            if (num % number != 0 && number > 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static String getWeekDay(int value) {
        String[] days = new String[]{
                "doesn't exist", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        switch (value) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return days[value];
        }
        return days[0];
    }

    private static boolean isBissextile(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
    }

    public static String getNextDayDate(int day, int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isBissextile(year) && month == 2) {
            daysInMonth[1] = 29;
        }

        if (day > daysInMonth[month - 1] || day < 1) {
            throw new IllegalStateException("Invalid date");
        }

        StringBuilder sb = new StringBuilder();

        if (day == daysInMonth[month - 1]) {
            day = 1;
            if (month == 12) {
                year++;
                month = 1;
            } else {
                month++;
            }
        } else {
            day++;
        }

        if (day <= 9) {
            sb.append("0");
        }
        sb.append(day);
        sb.append(".");

        if (month <= 9) {
            sb.append("0");
        }
        sb.append(month);

        sb.append(".");
        sb.append(year);
        return sb.toString();
    }
}

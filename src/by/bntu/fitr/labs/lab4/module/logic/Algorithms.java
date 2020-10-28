package by.bntu.fitr.labs.lab4.module.logic;

import by.bntu.fitr.labs.lab4.view.Output;

public class Algorithms {
    private final static String INVALID_DAY = "doesn't exist";

    public static <T extends Comparable<T>> T findMax(T... arr) {
        if (arr.length == 0) {
            throw new IllegalStateException("Array length can not be zero.");
        }

        T max = arr[0];
        for (T var : arr) {
            if (var.compareTo(max) > 0) {
                max = var;
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
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    public static String getWeekDay(int value) {
        String[] days = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        switch (--value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return days[value];
        }
        return INVALID_DAY;
    }
}

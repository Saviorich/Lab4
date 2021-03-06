package by.bntu.fitr.labs.lab4.controller;

import by.bntu.fitr.labs.lab4.module.entity.Dice;
import by.bntu.fitr.labs.lab4.module.entity.DiceGroup;
import by.bntu.fitr.labs.lab4.module.entity.Dragon;
import by.bntu.fitr.labs.lab4.view.Output;
import by.bntu.fitr.labs.lab4.module.logic.Algorithms;
import by.bntu.fitr.labs.lab4.module.utils.Input;

public class Main {
    private static StringBuilder sb;

    public static void main(String[] args) {
        sb = new StringBuilder();

        testDragon();
        testFindMax();
        testIsMultipleOfNumbers();
        testDice();
        testNextDayDate();
    }

    private static void testDragon() {
        Output.consolePrint("Enter age: ");
        int age = Input.getInt();
        Dragon dragon = new Dragon(age);

        sb.append("Dragon has ");
        sb.append(dragon.getHeads());
        sb.append(" heads and ");
        sb.append(dragon.getEyes());
        sb.append(" eyes.");

        Output.consolePrintLine(sb);
        sb.delete(0, sb.length());
    }

    private static void testFindMax() {
        Output.consolePrint("\nEnter amount of elements: ");
        int n = Input.getInt();
        sb.append("In array of numbers ");
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Algorithms.getRandomInt(-100, 100);
            sb.append(arr[i]);
            sb.append(" ");
        }

        try {
            sb.append("the greatest number is ");
            sb.append(Algorithms.findMax(arr));
            Output.consolePrintLine(sb);
        } catch (IllegalStateException e) {
            Output.consolePrintLine(e.toString());
        } finally {
            sb.delete(0, sb.length());
        }
    }

    private static void testIsMultipleOfNumbers() {
        Output.consolePrint("Enter one number: ");
        int number = Input.getInt();
        int n = Algorithms.getRandomInt(1, 5);
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Algorithms.getRandomInt(1, 80);
        }
        boolean multiple = Algorithms.isMultipleOfNumbers(number, 2, 3, 5);
        sb.append("\nNumber ");
        sb.append(number);
        sb.append(multiple ? " is " : " is not ");
        sb.append("multiple of the numbers ");
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }

        Output.consolePrintLine(sb);

        sb.delete(0, sb.length());
    }

    private static void testDice() {
        sb.append("\nResult of toss of 2 Dices: ");
        sb.append(new DiceGroup(new Dice(), new Dice()).tossAll());
        Output.consolePrintLine(sb.toString());

        Output.consolePrint("\nEnter day of week number: ");
        int day = Input.getInt();
        sb.delete(0, sb.length());
        sb.append("Day of week with number ");
        sb.append(day);
        sb.append(" - ");
        sb.append(Algorithms.getWeekDay(day));

        Output.consolePrintLine(sb.toString());
    }

    private static void testNextDayDate() {
        Output.consolePrint("Enter day: ");
        int day = Input.getInt();

        Output.consolePrint("Enter month: ");
        int month = Input.getInt();

        Output.consolePrint("Enter year: ");
        int year = Input.getInt();

        Output.consolePrint("Next day date: ");
        try {
            Output.consolePrintLine(Algorithms.getNextDayDate(day, month, year));
        } catch (Exception e) {
            Output.consolePrintLine(e.toString());
        }
    }
}
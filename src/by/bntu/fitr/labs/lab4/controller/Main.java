package by.bntu.fitr.labs.lab4.controller;

import by.bntu.fitr.labs.lab4.module.entity.Dice;
import by.bntu.fitr.labs.lab4.module.entity.DiceGroup;
import by.bntu.fitr.labs.lab4.module.entity.Dragon;
import by.bntu.fitr.labs.lab4.view.Output;
import by.bntu.fitr.labs.lab4.module.logic.Algorithms;
import by.bntu.fitr.labs.lab4.module.utils.Input;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Output.consolePrint("Enter age: ");
        int age = Input.getInt();
        Dragon dragon = new Dragon(age);

        StringBuilder sb = new StringBuilder();
        sb.append("Dragon has ");
        sb.append(dragon.getHeads());
        sb.append(" heads and ");
        sb.append(dragon.getEyes());
        sb.append(" eyes.");

        Output.consolePrintLine(sb);
        sb.delete(0, sb.length());

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


        Output.consolePrint("Enter one number: ");
        int number = Input.getInt();
        n = Algorithms.getRandomInt(1, 5);
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Algorithms.getRandomInt(1, 80);
        }
        boolean multiple = Algorithms.isMultipleOfNumbers(number, 2, 3, 5);
        sb.append("\n\nThe num ");
        sb.append(number);
        sb.append(multiple ? " is " : " is not ");
        sb.append("multiple of the numbers ");
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }

        Output.consolePrintLine(sb);


        sb.delete(0, sb.length()); // Clear StringBuilder
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
}
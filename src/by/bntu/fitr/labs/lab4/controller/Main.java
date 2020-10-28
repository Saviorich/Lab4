package by.bntu.fitr.labs.lab4.controller;

import by.bntu.fitr.labs.lab4.module.entity.Dice;
import by.bntu.fitr.labs.lab4.module.entity.DiceGroup;
import by.bntu.fitr.labs.lab4.module.entity.Dragon;
import by.bntu.fitr.labs.lab4.view.Output;
import by.bntu.fitr.labs.lab4.module.logic.Algorithms;
import by.bntu.fitr.labs.lab4.module.utils.Input;

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

        Output.consolePrint("\nEnter amount of elements: ");
        int n = Input.getInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Algorithms.getRandomInt(-100, 100);
        }

        try {
            Output.consolePrintLine(Algorithms.findMax(arr));
        } catch (IllegalStateException e) {
            Output.consolePrintLine(e.toString());
        }

        Output.consolePrintLine(Algorithms.isMultipleOfNumbers(1, 2, 3, 5));

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
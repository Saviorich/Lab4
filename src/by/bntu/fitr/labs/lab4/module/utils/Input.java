package by.bntu.fitr.labs.lab4.module.utils;

import by.bntu.fitr.labs.lab4.view.Output;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    final static Scanner input = new Scanner(System.in);

    public static int getInt() {
        boolean done = false;
        int res = Integer.MIN_VALUE;

        while (!done) {
            try {
                res = input.nextInt();
                done = true;
            } catch (InputMismatchException e){
                Output.consolePrintLine(e.toString());
                input.next();
            }
        }
        return res;
    }

    public static long getLong() {
        boolean done = false;
        long res = Long.MIN_VALUE;

        while (!done) {
            try {
                res = input.nextLong();
                done = true;
            } catch (InputMismatchException e){
                Output.consolePrintLine(e.toString());
                input.next();
            }
        }
        return res;
    }

    public static String getString() {
        return input.next();
    }
}

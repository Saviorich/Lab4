package by.bntu.fitr.labs.lab4.view;

public class Output {
    public static <T> void consolePrint(T string) {
        System.out.print(string);
    }

    public static <T> void consolePrintLine(T string) {
        System.out.println(string);
    }
}
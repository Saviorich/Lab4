package by.bntu.fitr.labs.lab4.module.entity;

import by.bntu.fitr.labs.lab4.module.logic.Algorithms;

public class Dice {
    private final static int MIN_VALUE = 1;
    private final static int MAX_VALUE = 6;

    public int toss() {
        return Algorithms.getRandomInt(MIN_VALUE, MAX_VALUE);
    }
}

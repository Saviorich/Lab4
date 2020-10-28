package by.bntu.fitr.labs.lab4.module.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DiceGroup {
    private List<Dice> diceGroup;

    public DiceGroup() {
        diceGroup = new ArrayList<Dice>();
    }

    public DiceGroup(Dice... args) {
        diceGroup = new ArrayList<Dice>(Arrays.asList(args));
    }

    public void add(Dice dice) {
        diceGroup.add(dice);
    }

    public int tossAll() {
        int count = 0;
        for (Dice d : diceGroup) {
            count += d.toss();
        }
        return count;
    }
}
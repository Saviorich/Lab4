package by.bntu.fitr.labs.lab4.module.entity;

public class Dragon {

    final static int START_DRAGONS_HEADS = 3;
    final static int EYE_PER_DRAGON_HEAD = 2;

    final static int FIRST_PERIOD = 0;
    final static int SECOND_PERIOD = 200;
    final static int THIRD_PERIOD = 300;

    final static int HEAD_PER_FIRST_PERIOD = 3;
    final static int HEAD_PER_SECOND_PERIOD = 2;
    final static int HEAD_PER_THIRD_PERIOD = 1;

    private int heads;
    private int eyes;
    private int age;

    public Dragon(int age) {
        setAge(age);
        heads = calculateDragonsHeads();
        eyes = calculateDragonEyes();
    }

    private int calculateDragonsHeads() {
        int result = START_DRAGONS_HEADS;

        if (age > THIRD_PERIOD) {
            result += (SECOND_PERIOD - FIRST_PERIOD) * HEAD_PER_FIRST_PERIOD +
                    (THIRD_PERIOD - SECOND_PERIOD) * HEAD_PER_SECOND_PERIOD +
                    (age - THIRD_PERIOD) * HEAD_PER_THIRD_PERIOD;
        } else if (age > SECOND_PERIOD) {
            result += (SECOND_PERIOD - FIRST_PERIOD) * HEAD_PER_FIRST_PERIOD +
                    (age - SECOND_PERIOD) * HEAD_PER_SECOND_PERIOD;
        } else {
            result += age * HEAD_PER_FIRST_PERIOD;
        }
        return result;
    }

    private int calculateDragonEyes() {
        return heads * EYE_PER_DRAGON_HEAD;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 1);
    }

    public int getHeads() {
        return heads;
    }

    public int getEyes() {
        return eyes;
    }
}

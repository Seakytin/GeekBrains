package homework.lesson7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int satiety) {
        this.food -= satiety;
    }

    public void addFood(int foodCount) {
        this.food += foodCount;
    }

    public boolean isFoodEnough(int foodCount) {
        return getFood() >= foodCount;
    }


}

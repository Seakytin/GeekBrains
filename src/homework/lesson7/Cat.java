package homework.lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name,int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void printInfo(){
        System.out.println(this);
    }

    public boolean eat(Plate plate) {
        String validateMessage = checkEat(plate);
        if (validateMessage != null) {
            System.out.println(validateMessage);
            return false;
        }
        doEat(plate);
        satiety = true;
        return true;
    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    private String checkEat(Plate plate) {

        if (!plate.isFoodEnough(appetite)){
            return "Food is not enough in the plate!";
        }
        if (satiety) {
            return "Cat is already satiety!";
        }
        return null;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }
}

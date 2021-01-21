package homework.lesson7;

import java.util.Scanner;


public class CatTest {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("1", 5),
                new Cat("2", 6),
                new Cat("3", 7),
                new Cat("4", 8),
        };

        Plate plate = new Plate(15);

        printInfo(cats, plate);
        haveLunch(cats, plate);

        printInfo(cats, plate);
        addFood(plate);

        System.out.println("Added food: ");
        plate.info();
        System.out.println();

        haveLunch(cats, plate);
        printInfo(cats, plate);
    }

    private static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat :
                cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Has Cat '%s' eaten? Answer: %s%n", cat.getName(), result);
        }
        System.out.println();
    }

    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("---Info---");
        plate.info();
        printInfo(cats);
    }

    private static void printInfo(Cat... cats) {
        for (Cat cat: cats) {
            System.out.printf("Is cat '%s(appetite: %d)' hungry? Answer: %s%n",
                    cat.getName(), cat.getAppetite(), !cat.isSatiety());

        }
    }

    public static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new food count: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);

    }
}

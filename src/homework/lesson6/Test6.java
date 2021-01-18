package homework.lesson6;

public class Test6 {
    public static void main (String[] args) {
        Animal dog = new Dog(700, 3, 30);
        Animal cat = new Cat(500, 1, 0);
        Animal cat1 = new Cat(300, 1, 0);
        System.out.println(dog.run(500));
        System.out.println(cat.swim(3));
        System.out.println(cat1.run(200));
        System.out.println(Dog.getCount());
        System.out.println(Cat.getCount());
    }
}

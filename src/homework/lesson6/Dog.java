package homework.lesson6;

public class Dog extends Animal {
    protected static int count;
    public Dog(int maxRunDistance, int maxJumpHeight, int maxSpeedSwim) {
        super(maxRunDistance, maxJumpHeight, maxSpeedSwim);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {System.out.println("Собака может бежать " + maxRunDistance);return true;}
        else return false;
        }
    @Override
    public boolean jump(int height) {
        if (this.maxJumpHeight >= height) {System.out.println("Собака может прыгать " + maxJumpHeight);return true;}
        else return false;
    }
    @Override
    public boolean swim(int speed) {
        if (this.maxSpeedSwim >= speed) {System.out.println("Собака может плыть " + maxSpeedSwim); return true;}
        else return false;}

    @Override
    public String toString() {
       return "Dog{" +
               "maxRunDistance=" + maxRunDistance +
               ", maxJumpHeight=" + maxJumpHeight +
               ", maxSpeedSwim=" + maxSpeedSwim +
               '}';
    }
}

package homework.lesson6;

public class Cat extends Animal {
    protected static int count;
    public Cat(int maxRunDistance, int maxJumpHeight, int maxSpeedSwim) {
        super(maxRunDistance, maxJumpHeight, maxSpeedSwim);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {System.out.println("Кот может бежать " + maxRunDistance); return true; }
        return false;
        }
    @Override
    public boolean jump(int height) {
        if (this.maxJumpHeight >= height) {System.out.println("Кот может прыгать " + maxJumpHeight); return true; }
        return false;
    }
    @Override
    public boolean swim(int speed) {
        System.out.println("Кот не умеет плавать"); return false;}

   @Override
   public String toString() {
       return "Cat{" +
               "maxRunDistance=" + maxRunDistance +
               ", maxJumpHeight=" + maxJumpHeight +
               ", maxSpeedSwim=" + maxSpeedSwim +
               '}'; }
}

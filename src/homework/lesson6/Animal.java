package homework.lesson6;

public abstract class Animal {
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSpeedSwim;

    public Animal(int maxRunDistance, int maxJumpHeight, int maxSpeedSwim) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSpeedSwim = maxSpeedSwim;
    }
    public abstract boolean run (int distance);
    public abstract boolean jump (int height);
    public abstract boolean swim (int speed);


    public void printInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "maxRunDistance=" + maxRunDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                ", maxSpeedSwim=" + maxSpeedSwim +
                '}';
    }

}

public class Car {
    private String mark;
    private int speed;

    public Car(String mark, int speed) {
        this.mark = mark;
        this.speed = speed;
    }

    public String getMark() {
        return mark;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        System.out.println("Max speed: " + (getSpeed() + 50));
        return getSpeed();
    }

    @Override
    public String toString() {
        return "----------" + getMark() + "---------" + '\n' +
                "mark = " + mark + '\n' +
                "speed = " + speed;
    }
}

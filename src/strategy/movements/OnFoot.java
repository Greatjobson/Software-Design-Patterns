package strategy.movements;

import strategy.interfaces.MovementBehavior;

public class OnFoot implements MovementBehavior {
    private int speed = 5;
    @Override
    public void move(String target, int distance) {
        System.out.println("goes to the " + target);
        System.out.println("distance: " + distance + " km");
        System.out.println("Current speed: " + getSpeed() + " km/h");
        System.out.println("Arrival time: " + ((double)distance/getSpeed()) + "h");
        System.out.println("----------------------------");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}

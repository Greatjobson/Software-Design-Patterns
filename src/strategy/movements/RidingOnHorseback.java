package strategy.movements;

import strategy.interfaces.MovementBehavior;

public class RidingOnHorseback implements MovementBehavior {
    private int speed = 25;
    @Override
    public void move(String target, int distance) {
        System.out.println("moves on horseback towards " + target );
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

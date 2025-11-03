package strategy.interfaces;

public interface MovementBehavior {
    void move(String target, int distance);
    void setSpeed(int speed);
    int getSpeed();
}

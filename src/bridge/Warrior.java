package bridge;

import strategy.MovementBehavior;
import strategy.OnFoot;

public
abstract class Warrior {
    protected Weapon weapon;
    private MovementBehavior movementBehavior;
    protected String warriorType;

    public Warrior(Weapon weapon){
        this.weapon = weapon;
        this.movementBehavior = new OnFoot();
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    abstract public void fight(String target);

    public void performMove(String target,int distance) {
        System.out.print("The " + getWarriorType()+ " ");
        movementBehavior.move(target,distance);
    }

    public void setMovementBehavior(MovementBehavior movementBehavior) {
        this.movementBehavior = movementBehavior;
    }

    public void setWarriorType(String warriorType) {
        this.warriorType = warriorType;
    }
    public String getWarriorType() {
        return warriorType;
    }

    public MovementBehavior getMovementBehavior() {
        return movementBehavior;
    }

    public Weapon getWeapon() {
        return weapon;
    }


}

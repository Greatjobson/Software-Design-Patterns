package bridge.model;

import bridge.weapon.Sword;
import observer.api.Observer;
import strategy.interfaces.MovementBehavior;
import strategy.movements.OnFoot;

public
abstract class Warrior implements Observer {
    protected Weapon weapon;
    private MovementBehavior movementBehavior;
    protected String warriorType;

    public Warrior(Weapon weapon){
        this.weapon = weapon;
        this.movementBehavior = new OnFoot();
    }
    public Warrior(){
        this.weapon = new Sword();
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

    @Override
    public void update(String message) {
        System.out.println(getWarriorType() + " received a message: " + message);
    }

}

package decorator;

import bridge.Weapon;

abstract public class improvementDecorator implements Weapon {
    protected Weapon weapon;
    public improvementDecorator(Weapon weapon){
        this.weapon = weapon;
    }
}

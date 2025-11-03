package bridge.warrior;

import bridge.model.Warrior;
import bridge.model.Weapon;

public class Knight extends Warrior {
    public Knight(Weapon weapon) {
        super(weapon);
        super.warriorType = "[knight]";
    }
    public Knight(){
        super();
        super.warriorType = "[knight]";
    }
    public void fight(String target) {
        System.out.print("The " + getWarriorType() +" prepares and ");
        weapon.attack(target);
    }
}

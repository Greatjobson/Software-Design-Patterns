package bridge.warrior;

import bridge.model.Warrior;
import bridge.model.Weapon;

public class Viking extends Warrior {
    public Viking(Weapon weapon) {
        super(weapon);
        super.warriorType = "[viking]";
    }
    public Viking(){
        super();
        super.warriorType = "[viking]";
    }
    public void fight(String target) {
        System.out.print("The "+getWarriorType()+" is furious and ");
        weapon.attack(target);
    }
}

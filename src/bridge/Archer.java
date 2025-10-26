package bridge;

public class Archer extends Warrior{
    public Archer(Weapon weapon) {
        super(weapon);
        super.warriorType = "[archer]";
    }
    public void fight(String target) {
        System.out.print("The "+getWarriorType()+" takes aim and ");
        weapon.attack(target);
    }
}

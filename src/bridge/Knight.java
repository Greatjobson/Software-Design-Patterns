package bridge;

public class Knight extends Warrior{
    public Knight(Weapon weapon) {
        super(weapon);
        super.warriorType = "[knight]";
    }
    public void fight(String target) {
        System.out.print("The " + getWarriorType() +" prepares and ");
        weapon.attack(target);
    }
}

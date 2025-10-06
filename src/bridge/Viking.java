package bridge;

public class Viking extends Warrior{
    public Viking(Weapon weapon) {
        super(weapon);
    }
    public void fight(String target) {
        System.out.print("The Viking is furious and ");
        weapon.attack(target);
    }
}

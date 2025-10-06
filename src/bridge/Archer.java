package bridge;

public class Archer extends Warrior{
    public Archer(Weapon weapon) {
        super(weapon);
    }
    public void fight(String target) {
        System.out.print("The archer takes aim and ");
        weapon.attack(target);
    }
}

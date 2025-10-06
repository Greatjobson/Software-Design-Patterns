package bridge;

public class Knight extends Warrior{
    public Knight(Weapon weapon) {
        super(weapon);
    }
    public void fight(String target) {
        System.out.print("The knight prepares and ");
        weapon.attack(target);
    }
}

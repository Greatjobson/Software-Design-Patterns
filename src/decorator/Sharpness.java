package decorator;

import bridge.Weapon;

public class Sharpness extends improvementDecorator{
    public Sharpness(Weapon weapon){
        super(weapon);
    }

    @Override
    public String attackType() {
        return weapon.attackType();
    }

    @Override
    public int damage() {
        return weapon.damage() + 10;
    }

    @Override
    public String getDescription() {
        return weapon.getDescription() + " + Sharpness Effect";
    }

    @Override
    public void attack(String target) {
        System.out.println( attackType() + target + " with " + "[" + getDescription() + "]");
        System.out.println("-" + damage() + "xp");
        System.out.println("--------------------------");
    }
}

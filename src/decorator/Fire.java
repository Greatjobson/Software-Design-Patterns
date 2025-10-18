package decorator;

import bridge.*;

public class Fire extends improvementDecorator{
    Fire(Weapon weapon){
        super(weapon);
    }
    @Override
    public String attackType() {
        return weapon.attackType();
    }

    @Override
    public int damage() {
        return weapon.damage() + 20;
    }

    @Override
    public String getDescription() {
        return weapon.getDescription() + " + Fire Effect";
    }

    @Override
    public void attack(String target) {
        System.out.println( attackType() + target + " with " + "[" +  getDescription() + "]");
        System.out.println("-" + damage() + "xp");
        System.out.println("--------------------------");
    }
}

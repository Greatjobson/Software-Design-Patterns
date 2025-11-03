package bridge.weapon;

import bridge.model.Weapon;

public class Spear implements Weapon {
    public int damage(){
        return 15;
    }
    public String getDescription(){
        return "spear";
    }
    @Override
    public void attack(String target) {
        System.out.println(attackType() + target+ " with " + getDescription());
        System.out.println("-" + damage() + "xp");
        System.out.println("--------------------------");
    }
    @Override
    public String attackType() {
        return "Pierced the ";
    }
}

package bridge.weapon;

import bridge.model.Weapon;

public class Bow implements Weapon {
    public int damage(){
        return 7;
    }
    public String getDescription(){
        return "bow";
    }
    @Override
    public void attack(String target) {
        System.out.println(attackType() + target + " with " + getDescription());
        System.out.println("-" + damage() + "xp");
        System.out.println("--------------------------");
    }
    @Override
    public String attackType() {
        return "Shooting ";
    }

}

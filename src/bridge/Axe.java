package bridge;

public class Axe implements Weapon{
    public int damage(){
        return 20;
    }
    public String getDescription(){
        return "axe";
    }
    @Override
    public void attack(String target) {
        System.out.println(attackType() + target + " with " + getDescription());
        System.out.println("-" + damage() + "xp");
        System.out.println("--------------------------");
    }

    @Override
    public String attackType() {
        return "Chopped up the";
    }
}

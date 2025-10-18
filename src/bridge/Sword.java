package bridge;

public class Sword implements Weapon{
    public int damage(){
        return 10;
    }
    public String getDescription(){
        return "sword";
    }
    @Override
    public void attack(String target) {
        System.out.println(attackType() + target + " with " + getDescription());
        System.out.println("-" + damage() + "xp");
        System.out.println("--------------------------");
    }
    @Override
    public String attackType() {
        return "Slashing ";
    }
}

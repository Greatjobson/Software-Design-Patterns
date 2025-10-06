package bridge;

public class Sword implements Weapon{
    @Override
    public void attack(String target) {
        System.out.println("Slashing " + target + " with a sword!");
        System.out.println("-10xp");
    }
}

package bridge;

public class Spear implements Weapon {
    @Override
    public void attack(String target) {
        System.out.println("pierced the "+ target+ " with a spear");
        System.out.println("-15hp");
    }
}

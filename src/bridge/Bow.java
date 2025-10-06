package bridge;

public class Bow implements Weapon{
    @Override
    public void attack(String target) {
        System.out.println("Shooting " + target + " with a bow!");
        System.out.println("-7xp");
    }
}

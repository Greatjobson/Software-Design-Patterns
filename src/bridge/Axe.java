package bridge;

public class Axe implements Weapon{
    @Override
    public void attack(String target) {
        System.out.println("Chopped up the "+target+" with an axe");
        System.out.println("-20xp");
    }
}

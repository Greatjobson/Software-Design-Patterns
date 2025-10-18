package bridge;

public class testBridge {
    public static void main(String[] args) {
        Weapon sword1 = new Sword();
        Weapon bow1 = new Bow();
        Weapon spear = new Spear();
        Weapon axe = new Axe();
        Warrior knight1 = new Knight(sword1);
        Warrior archer = new Archer(bow1);
        Warrior vicing = new Viking(axe);

        knight1.fight("dragon");

        knight1.setWeapon(bow1);
        knight1.fight("An enemy knight");

        knight1.setWeapon(axe);
        knight1.fight("An enemy knight");

        archer.fight("An enemy knight");

        vicing.fight("ninja");
        vicing.setWeapon(spear);
        vicing.fight("An enemy knight");
    }
}

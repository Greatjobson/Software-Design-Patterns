package decorator;
import bridge.*;

public class test {
    public static void main(String[] args) {
        String[] targets = new String[]{"[dargon 1lvl]", "[dragon 10lvl]", "[dragon 99lvl]"};

        Weapon sword = new Sword();
        Warrior knight = new Knight(sword);
        System.out.println("------sword-ordinary------");
        knight.fight(targets[0]);
        //without any improves
        System.out.println(sword.getDescription());
        System.out.println(sword.damage());


        System.out.println("------sword-improved------");
        sword = new Sharpness(sword); //add effect
        knight.setWeapon(sword);
        knight.fight(targets[1]);
        System.out.println(sword.getDescription());
        System.out.println(sword.damage());

        System.out.println("-----sword-2-effects-----");
        sword = new Sharpness(sword);
        knight.setWeapon(sword);
        knight.fight(targets[2]);

        System.out.println(sword.getDescription());
        System.out.println(sword.damage());



        Weapon bow = new Bow();
        Warrior archer = new Archer(bow);
        System.out.println("------bow-ordinary------");

        System.out.println(bow.getDescription());
        System.out.println(bow.damage());
        archer.fight(targets[0]);

        System.out.println("------bow-improved------");
        bow = new Sharpness(bow);
        archer.setWeapon(bow);
        archer.fight(targets[1]);

        System.out.println(bow.getDescription());
        System.out.println(bow.damage());

        System.out.println("-----bow-2-effects-----");
        bow = new Fire(bow);
        archer.setWeapon(bow);
        archer.fight(targets[2]);

        System.out.println(bow.getDescription());
        System.out.println(bow.damage());

    }
}

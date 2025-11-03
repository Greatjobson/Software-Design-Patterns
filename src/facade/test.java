package facade;

import bridge.model.Weapon;
import bridge.warrior.Archer;
import bridge.warrior.Knight;
import bridge.warrior.Viking;
import bridge.weapon.Axe;
import bridge.weapon.Bow;
import bridge.weapon.Sword;

public class test {
    public static void main(String[] args) {
        Weapon sword = new Sword();


        Archer archer = new Archer(new Bow());
        Knight knight = new Knight(sword);
        Knight elite = new Knight(sword);
        Viking viking = new Viking(new Axe());
        Knight example = new Knight(sword);
        AttackStrategy strategy = new AttackStrategy.Builder()
                .setEliteKnight(elite)
                .setKnight(knight)
                .setViking(viking)
                .setTarget("[dragon 10lvl]")
                .build();

        strategy.closeCombat();
        strategy.longRangeCombat();
    }
}

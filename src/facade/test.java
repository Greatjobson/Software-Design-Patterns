package facade;

import bridge.*;

public class test {
    public static void main(String[] args) {
        Archer archer = new Archer(new Bow());
        Knight knight = new Knight(new Sword());
        Knight elite = new Knight(new Sword());
        Viking viking = new Viking(new Axe());

        AttackStrategy strategy = new AttackStrategy.Builder()
                .setEliteKnight(elite)
                .setKnight(knight)
                .setArcher(archer)
                .setViking(viking)
                .setTarget("[dragon 10lvl]")
                .build();

        strategy.closeCombat();
        strategy.longRangeCombat();
    }
}

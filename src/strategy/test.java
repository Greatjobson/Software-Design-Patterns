package strategy;

import bridge.*;

public class test {
    public static void main(String[] args) {
        Weapon sword = new Sword();
        Weapon bow = new Bow();
        MovementBehavior onHorse = new RidingOnHorseback();
        MovementBehavior onShip = new OnTheShip();

        Warrior knight = new Knight(sword);
        Warrior archer = new Archer(bow);
        Warrior viking = new Viking(sword);
        String target = "[DRAGON]";

        knight.performMove(target,10);

        archer.performMove("[Defense tower]",5);

        viking.setMovementBehavior(onHorse);
        viking.performMove(target,11);

        viking.setMovementBehavior(onShip);
        viking.performMove("village",20);
    }
}

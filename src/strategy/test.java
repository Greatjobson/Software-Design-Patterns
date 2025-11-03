package strategy;

import bridge.model.Warrior;
import bridge.model.Weapon;
import bridge.warrior.Archer;
import bridge.warrior.Knight;
import bridge.warrior.Viking;
import bridge.weapon.Bow;
import bridge.weapon.Sword;
import strategy.interfaces.MovementBehavior;
import strategy.movements.OnTheShip;
import strategy.movements.RidingOnHorseback;

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

package facade;

import bridge.*;
import decorator.*;

public class AttackStrategy {
    private Knight knight;
    private Knight eliteKnight;
    private Archer archer;
    private Viking viking;
    private String target;

    private AttackStrategy() {} // приватный конструктор

    //builder
    public static class Builder {
        private Knight knight;
        private Knight eliteKnight;
        private Archer archer;
        private Viking viking;
        private String target;

        public Builder setKnight(Knight knight) {
            this.knight = knight;
            return this;
        }

        public Builder setEliteKnight(Knight eliteKnight) {
            this.eliteKnight = eliteKnight;
            return this;
        }

        public Builder setArcher(Archer archer) {
            this.archer = archer;
            return this;
        }

        public Builder setViking(Viking viking) {
            this.viking = viking;
            return this;
        }

        public Builder setTarget(String target) {
            this.target = target;
            return this;
        }

        public AttackStrategy build() {
            AttackStrategy strategy = new AttackStrategy();
            strategy.knight = this.knight;
            strategy.eliteKnight = this.eliteKnight;
            strategy.archer = this.archer;
            strategy.viking = this.viking;
            strategy.target = this.target;
            return strategy;
        }
    }

    public void armWarriors() {
        System.out.println("The warriors received weapons");
        if (knight != null) knight.setWeapon(new Sword());
        if (eliteKnight != null) eliteKnight.setWeapon(new Sharpness(new Sword()));
        if (archer != null) archer.setWeapon(new Bow());
        if (viking != null) viking.setWeapon(new Axe());
    }

    public void MarchToTheGoal() {
        System.out.println("The warriors are moving towards the " + target);
    }

    public void FallIntoLine() {
        System.out.println("The warriors stand in line.");
    }

    public void warriorsAttacks() {
        if (knight != null) knight.fight(target);
        if (eliteKnight != null) eliteKnight.fight(target);
        if (archer != null) archer.fight(target);
        if (viking != null) viking.fight(target);
    }

    public void attakWithBow() {
        if (archer == null)
            System.out.println("We dont have archer");
        System.out.println("The archers are standing behind the shields.");
        archer.fight(target);
    }

    public void SpearFormationDefense() {
        if (knight == null) return;
        knight.setWeapon(new Spear());
        System.out.println("Spear formation defense!");
    }

    public void longRangeCombat() {
        System.out.println("\n--- LONG RANGE COMBAT ---");
        System.out.println("Target -> " + target);
        armWarriors();
        FallIntoLine();
        SpearFormationDefense();
        attakWithBow();
    }

    public void closeCombat() {
        System.out.println("\n--- CLOSE COMBAT ---");
        System.out.println("Target -> " + target);
        armWarriors();
        FallIntoLine();
        MarchToTheGoal();
        SpearFormationDefense();
        warriorsAttacks();
    }
}

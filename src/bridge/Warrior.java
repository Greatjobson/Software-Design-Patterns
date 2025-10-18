package bridge;

public abstract class Warrior {
    protected Weapon weapon;
    public Warrior(Weapon weapon){
        this.weapon = weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight(String target){};
}

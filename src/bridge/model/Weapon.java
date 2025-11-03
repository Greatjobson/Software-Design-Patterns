package bridge.model;

public interface Weapon {
    String attackType();
    int damage();
    String getDescription();
    void attack(String target);
}

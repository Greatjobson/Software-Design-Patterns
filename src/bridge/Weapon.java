package bridge;

public interface Weapon {
    String attackType();
    int damage();
    String getDescription();
    void attack(String target);
}

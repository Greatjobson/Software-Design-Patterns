package visitor;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer();
        Knight knight = new Knight();

        Visitor move = new MovementVisitor();
        Visitor attack = new AttackVisitor();


        move.visit(archer);
        move.visit(knight);

        attack.visit(archer);
    }
}

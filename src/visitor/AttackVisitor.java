package visitor;

public class AttackVisitor implements Visitor{

    @Override
    public void visit(Knight knight) {
        System.out.println("The knight is attacking");
    }

    @Override
    public void visit(Archer archer) {
        System.out.println("The archer is attacking");
    }
}

package visitor;

public class MovementVisitor implements Visitor{
    @Override
    public void visit(Knight knight) {
        System.out.println("The knight is walking");
    }

    @Override
    public void visit(Archer archer) {
        System.out.println("The archer is walking");
    }
}

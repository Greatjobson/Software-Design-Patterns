package visitor;

public interface Visitor {
    void visit(Knight knight);
    void visit(Archer archer);
}

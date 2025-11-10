package visitor;

public class Archer implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

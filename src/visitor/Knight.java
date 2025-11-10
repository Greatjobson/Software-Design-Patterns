package visitor;

public class Knight implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

package edu.mum.cs.cs525.labs.skeleton;

public class Leaf extends Component{
    public Leaf(Double value) {
        super(value);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

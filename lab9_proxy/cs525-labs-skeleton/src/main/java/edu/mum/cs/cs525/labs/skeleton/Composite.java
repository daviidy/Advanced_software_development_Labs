package edu.mum.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    List<Leaf> leafs = new ArrayList<>();
    public Composite(Double value) {
        super(value);
    }

    public void addLeaf(Leaf leaf){
        leafs.add(leaf);
    }

    @Override
    public void accept(Visitor visitor) {
        for(Leaf leaf: leafs){
            visitor.visit(leaf);
        }
        visitor.visit(this);
    }
}

package edu.mum.cs.cs525.labs.skeleton.final_exam;

public class Leaf extends Component {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}


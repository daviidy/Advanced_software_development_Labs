package edu.mum.cs.cs525.labs.skeleton;

public interface Visitor {
    public void visit(Composite composite);
    public void visit(Leaf leaf);
}

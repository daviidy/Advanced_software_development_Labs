package edu.mum.cs.cs525.labs.skeleton.final_exam;

public interface Visitor {
    void visit(Composite composite);
    void visit(Leaf leaf);
}


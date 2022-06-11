package edu.mum.cs.cs525.labs.skeleton.final_exam;

public abstract class VisitorChain implements Visitor {
    private Visitor nextVisitor;
    public VisitorChain(Visitor nextVisitor) {
        super();
        this.nextVisitor = nextVisitor;
    }
    public void visit(Composite composite) {
        performVisit(composite);
        this.nextVisitor.visit(composite);
    }
    public void visit(Leaf leaf) {
        performVisit(leaf);
        this.nextVisitor.visit(leaf);
    }
    protected abstract void performVisit(Leaf leaf);
    protected abstract void performVisit(Composite composite);
}


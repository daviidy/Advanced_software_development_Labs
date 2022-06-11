package edu.mum.cs.cs525.labs.skeleton.final_exam;

public class ComponentCounter extends VisitorChain {
    private ComponentCollector componentCollector;

    public ComponentCounter(Visitor nextVisitor) {
        super(nextVisitor);
    }
    @Override
    protected void performVisit(Composite composite) {
        componentCollector.visit(composite);
        System.out.println(componentCollector.getComponents().size());
    }
    @Override
    protected void performVisit(Leaf leaf) {
        componentCollector.visit(leaf);
    }
}


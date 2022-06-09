package edu.mum.cs.cs525.labs.skeleton;

import java.util.function.Supplier;

public class TotalCollector implements Supplier<Double>, Visitor {
    private Double total = 0.0;
    @Override
    public void visit(Composite composite) {
        total += composite.getValue();
    }
    @Override
    public void visit(Leaf leaf) {
        total += leaf.getValue();
    }
    @Override
    public Double get() {
        return total;
    }
}

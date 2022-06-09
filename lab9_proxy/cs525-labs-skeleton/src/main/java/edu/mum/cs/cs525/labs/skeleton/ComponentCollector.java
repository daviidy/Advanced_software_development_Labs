package edu.mum.cs.cs525.labs.skeleton;

import java.util.function.Supplier;

public class ComponentCollector implements Supplier<Component>, Visitor {
    private Component max;
    @Override
    public void visit(Composite composite) {
        if(max == null) max = composite;
        if(max.getValue() < composite.getValue()) max = composite;
    }
    @Override
    public void visit(Leaf leaf) {
        if(max == null) max = leaf;
        if(max.getValue() < leaf.getValue()) max = leaf;
    }
    @Override
    public Component get() {
        return max;
    }
}

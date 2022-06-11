package edu.mum.cs.cs525.labs.skeleton.final_exam;

import java.util.Collection;
import java.util.LinkedList;

public class Composite extends Component {
    private Collection<Component> components = new LinkedList<>();
    public void addComponent(Component c) {
        components.add(c);
    }
    public void removeComponent(Component c) {
        components.remove(c);
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
        for(Component c : components) {
            c.accept(v);
        }
    }
}


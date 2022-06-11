package edu.mum.cs.cs525.labs.skeleton.final_exam;

import java.util.Iterator;

public abstract class Component implements Iterable<Component> {
    public abstract void accept(Visitor v);
    public Iterator<Component> iterator() {
        return this.iterator();
    }
}


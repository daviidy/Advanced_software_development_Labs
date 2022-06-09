package edu.mum.cs.cs525.labs.skeleton;

public abstract class Component implements Consumer<Visitor> {
    private Double value;

    public Component(Double value){
        this.value = value;
    }

    public final Double getValue() {
        return value;
    }
}

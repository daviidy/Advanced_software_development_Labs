package edu.mum.cs.cs525.labs.skeleton;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}


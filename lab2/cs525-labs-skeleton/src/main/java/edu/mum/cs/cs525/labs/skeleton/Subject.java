package edu.mum.cs.cs525.labs.skeleton;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

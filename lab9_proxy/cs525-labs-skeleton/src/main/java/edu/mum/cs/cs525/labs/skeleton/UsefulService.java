package edu.mum.cs.cs525.labs.skeleton;

public class UsefulService {
    private final Complex complex;

    public UsefulService(Complex complex) {
        this.complex = complex;
    }

    public void showComplicatedTask(){
        complex.veryComplicatedTask();
    }

    public void showAnotherTask(){
        complex.anotherTask();
    }
}

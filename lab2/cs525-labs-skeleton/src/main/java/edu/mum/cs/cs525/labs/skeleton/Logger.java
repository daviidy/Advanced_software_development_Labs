package edu.mum.cs.cs525.labs.skeleton;

public class Logger implements Observer, Dispatcher {

    public Logger(){
    }
    @Override
    public void dispatch() {
        this.update();
    }

    @Override
    public void update() {
        System.out.println("New Log for an account change");
    }
}

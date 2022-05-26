package edu.mum.cs.cs525.labs.skeleton;

public class SMSSender implements Observer, Dispatcher {
    private Account account;
    public SMSSender(){
    }
    @Override
    public void dispatch() {
        this.update();
    }

    @Override
    public void update() {
        System.out.println("New SMS for an account change");
    }
}

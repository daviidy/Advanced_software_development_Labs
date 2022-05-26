package edu.mum.cs.cs525.labs.skeleton;

public class EmailSender implements Observer, Dispatcher {
    private Account account;

    public EmailSender(){
    }
    @Override
    public void update() {
        this.dispatch();
    }

    @Override
    public void dispatch() {
        System.out.println("New Email for an account change");
    }
}

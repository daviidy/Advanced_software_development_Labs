package edu.mum.cs.cs525.labs.skeleton;

public class CheckingAccount extends Account{

    public CheckingAccount(String accountNumber) {
        super(accountNumber);
        this.interest = new CheckingInterest();
        this.interest = new P2(this.interest);
    }
}

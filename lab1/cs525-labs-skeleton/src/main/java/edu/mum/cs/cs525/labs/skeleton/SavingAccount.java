package edu.mum.cs.cs525.labs.skeleton;

public class SavingAccount extends Account{
    public SavingAccount(String accountNumber) {
        super(accountNumber);
        this.interest = new SavingInterest();
        // wrap saving interest with P1
        this.interest = new P1(this.interest);
    }
}

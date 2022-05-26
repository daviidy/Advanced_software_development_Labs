package edu.mum.cs.cs525.labs.skeleton;

public class CheckingInterest implements IInterest{
    @Override
    public double calculateInterest(double balance) {
        if (balance < 1000){
            return (balance * 1.5) / 100;
        }
        else {
            return (balance * 2.5) / 100;
        }
    }
}

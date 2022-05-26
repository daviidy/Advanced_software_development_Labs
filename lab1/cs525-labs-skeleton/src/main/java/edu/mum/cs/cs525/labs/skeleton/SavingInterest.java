package edu.mum.cs.cs525.labs.skeleton;

public class SavingInterest implements IInterest{
    @Override
    public double calculateInterest(double balance) {
        if (balance < 1000){
            return (balance * 1) / 100;
        }
        else if (balance > 1000 && balance < 5000){
            return (balance * 2) / 100;
        }
        else {
            return (balance * 4) / 100;
        }
    }
}

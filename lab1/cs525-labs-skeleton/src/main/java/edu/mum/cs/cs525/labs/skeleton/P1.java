package edu.mum.cs.cs525.labs.skeleton;

public class P1 extends InterestPromotionDecorator{
    public P1(IInterest interest) {
        super(interest);
    }

    @Override
    public double calculateInterest(double balance) {
        return super.calculateInterest(balance) + p1Interest(balance);
    }

    public double p1Interest(double balance){
        return (balance * 1) / 100;
    }
}

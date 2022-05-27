package edu.mum.cs.cs525.labs.skeleton;

public class P2 extends InterestPromotionDecorator{
    public P2(IInterest interest) {
        super(interest);
    }

    @Override
    public double calculateInterest(double balance) {
        return super.calculateInterest(balance) + p2Interest(balance);
    }

    public double p2Interest(double balance){
        return (balance * 2) / 100;
    }
}

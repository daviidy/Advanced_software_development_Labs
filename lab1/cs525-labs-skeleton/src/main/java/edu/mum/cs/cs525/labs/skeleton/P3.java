package edu.mum.cs.cs525.labs.skeleton;

public class P3 extends InterestPromotionDecorator{
    public P3(IInterest interest) {
        super(interest);
    }

    @Override
    public double calculateInterest(double balance) {
        return super.calculateInterest(balance) + p3Interest(balance);
    }

    public double p3Interest(double balance){
        return (balance * 3) / 100;
    }
}

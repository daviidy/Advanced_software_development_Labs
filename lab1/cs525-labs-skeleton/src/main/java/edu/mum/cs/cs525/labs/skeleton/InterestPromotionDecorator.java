package edu.mum.cs.cs525.labs.skeleton;

public class InterestPromotionDecorator implements IInterest {
    //implements or extends the class we want to decorate
    //and has a reference to this class
    private IInterest interest;

    public InterestPromotionDecorator(IInterest interest){
        this.interest = interest;
    }
    @Override
    public double calculateInterest(double balance) {
        return interest.calculateInterest(balance);
    }
}

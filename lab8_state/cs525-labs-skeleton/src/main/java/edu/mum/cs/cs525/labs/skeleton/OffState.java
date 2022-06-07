package edu.mum.cs.cs525.labs.skeleton;


public class OffState implements State{
    private CeilingFan fan;

    public OffState(CeilingFan fan){
        this.fan = fan;
    }
    @Override
    public void pullgreen() {
        System.out.println( "low speed..." );
        fan.setState(fan.getLowSpeedState());
    }

    @Override
    public void pullred() {
        System.out.println( "high speed..." );
        fan.setState(fan.getHighSpeedState());
    }
}

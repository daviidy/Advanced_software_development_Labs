package edu.mum.cs.cs525.labs.skeleton;

public class MediumSpeedState implements State {
    private CeilingFan fan;

    public MediumSpeedState(CeilingFan fan){
        this.fan = fan;
    }
    @Override
    public void pullgreen() {
        System.out.println( "high speed" );
        fan.setState(fan.getHighSpeedState());
    }

    @Override
    public void pullred() {
        System.out.println( "low speed" );
        fan.setState(fan.getLowSpeedState());
    }
}

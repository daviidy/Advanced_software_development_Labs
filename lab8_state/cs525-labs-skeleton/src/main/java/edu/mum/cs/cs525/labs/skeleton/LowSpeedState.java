package edu.mum.cs.cs525.labs.skeleton;

public class LowSpeedState implements State {
    private CeilingFan fan;

    public LowSpeedState(CeilingFan fan){
        this.fan = fan;
    }

    @Override
    public void pullgreen() {
        System.out.println( "medium speed" );
        fan.setState(fan.getMediumSpeedState());
    }

    @Override
    public void pullred() {
        System.out.println( "turning off..." );
        fan.setState(fan.getOffState());
    }
}

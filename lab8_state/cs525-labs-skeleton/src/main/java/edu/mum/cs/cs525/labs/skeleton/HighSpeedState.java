package edu.mum.cs.cs525.labs.skeleton;

public class HighSpeedState implements State {

    private CeilingFan fan;

    public HighSpeedState(CeilingFan fan){
        this.fan = fan;
    }

    @Override
    public void pullgreen() {
        System.out.println( "turning off..." );
        fan.setState(fan.getOffState());
    }

    @Override
    public void pullred() {
        System.out.println( "medium speed" );
        fan.setState(fan.getMediumSpeedState());
    }
}

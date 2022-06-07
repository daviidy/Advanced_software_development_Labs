package edu.mum.cs.cs525.labs.skeleton;

public class CeilingFan {
    State offState;
    State lowSpeedState;
    State mediumSpeedState;
    State highSpeedState;
    State state;

    public CeilingFan(){
        offState = new OffState(this);
        lowSpeedState = new LowSpeedState(this);
        mediumSpeedState = new MediumSpeedState(this);
        highSpeedState = new HighSpeedState(this);
        state = offState;
    }
    public void pullgreen() {
        state.pullgreen();
    }

    public void pullred() {
        state.pullred();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getOffState() {
        return offState;
    }

    public State getLowSpeedState() {
        return lowSpeedState;
    }

    public State getMediumSpeedState() {
        return mediumSpeedState;
    }

    public State getHighSpeedState() {
        return highSpeedState;
    }
}

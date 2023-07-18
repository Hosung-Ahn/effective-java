package com.effectivejava.item3;

public class Concert {
    private boolean lightOn = false;
    private boolean stageOpen = false;
    private IElvis elvis;

    public Concert(IElvis elvis) {
        this.elvis = elvis;
    }

    public void perform(){
        lightOn = true;
        stageOpen = true;
        elvis.sing();
    }

    public boolean isLightOn() {
        return lightOn;
    }

    public boolean isStageOpen() {
        return stageOpen;
    }
}

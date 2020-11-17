package com.company;

public class TurnTVOff {
    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice){

        theDevice = newDevice;
    }

    public void execute() {

        theDevice.off();
    }

    public void undo() {

        theDevice.on();
    }
}

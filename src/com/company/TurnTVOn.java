package com.company;

public class TurnTVOn implements CommandBase {
    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDevice){

        theDevice = newDevice;
    }

    public void execute() {

        theDevice.on();
    }

    public void undo() {

        theDevice.off();
    }
}

package com.company;

public class TurnVolumeDown implements CommandBase {

    ElectronicDevice theDevice;

    public TurnVolumeDown(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.volumeDown();

    }

    public void undo() {

        theDevice.volumeUp();

    }
}
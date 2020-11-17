package com.company;

public class TurnVolumeUp implements CommandBase {

    ElectronicDevice theDevice;

    public TurnVolumeUp(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.volumeUp();

    }

    public void undo() {

        theDevice.volumeDown();

    }
}
package com.company;

public class Main {
    //Vores "Client"
    public static void main(String[] args) {
        //Vi gider ikke bare køre Television.on();

        // Får hvilket type elektronisk enhed der skal bruges
        ElectronicDevice newDevice = TVRemote.getDevice();

        //Dette command objekt indeholder kommando til at tænde fjernsynet, og vil køre on() i television når execute() kaldes nedenfor.
        TurnTVOn ON = new TurnTVOn(newDevice);

        //Her startes Invoker klassen. Vi laver en ON knap på fjernbetjeningen.
        RemoteButton button = new RemoteButton(ON);

        // Når knappen trykkes kører TurnTVOn.execute();
        button.press();

        //Og vi kan gøre det om igen
        button.pressUndo();

        //---//

        //Vi kan gøre det samme med alle commands
        TurnVolumeUp volumeUp = new TurnVolumeUp(newDevice);

        //Laver en volume UP knap
        RemoteButton upButton = new RemoteButton(volumeUp);

        //Vi kan trykke knappen mange gange, og evt sætte dem i kø i invokeren.
        upButton.press();
        upButton.press();
        upButton.press();
        upButton.pressUndo();
    }
}

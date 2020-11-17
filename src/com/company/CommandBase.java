package com.company;

//Alle commands vil implementere denne
public interface CommandBase {

    void execute();

    void undo();
}

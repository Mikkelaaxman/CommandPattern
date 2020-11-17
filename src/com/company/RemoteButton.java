package com.company;

/**
 * Invoker klassen. Den har metoden press() der kalder execute på TV'et
 * Man kan f.eks. også have en delayed press() eller anden
 * tids-/hændelses bestemmelse.
 * Her ville man også lave en kø at putte commands i.
 */
public class RemoteButton{

    //Har kun relation til CommandBase
    CommandBase theCommandBase;

    public RemoteButton(CommandBase newCommandBase){
        theCommandBase = newCommandBase;
    }

    //Tryk på knappen.
    public void press(){
        theCommandBase.execute();
    }

    //Knap til at undo en Command
    public void pressUndo(){
        theCommandBase.undo();
    }
}
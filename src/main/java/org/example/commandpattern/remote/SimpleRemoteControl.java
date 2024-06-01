package org.example.commandpattern.remote;

import org.example.commandpattern.command.Command;

public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command){
        this.slot = command;
    }
    public void wasButtonPressed(){
        slot.execute();
    }
}

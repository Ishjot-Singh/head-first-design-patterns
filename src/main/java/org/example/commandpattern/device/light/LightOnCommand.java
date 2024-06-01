package org.example.commandpattern.device.light;

import org.example.commandpattern.command.Command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}

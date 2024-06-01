package org.example.commandpattern;

import org.example.commandpattern.device.garage.GarageDoor;
import org.example.commandpattern.device.garage.GarageDoorOpenCommand;
import org.example.commandpattern.device.light.Light;
import org.example.commandpattern.device.light.LightOnCommand;
import org.example.commandpattern.remote.SimpleRemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        // Client creates the command object and sets it
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.wasButtonPressed();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.wasButtonPressed();
    }
}

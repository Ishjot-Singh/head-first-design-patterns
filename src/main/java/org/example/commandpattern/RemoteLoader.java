package org.example.commandpattern;

import org.example.commandpattern.device.garage.GarageDoor;
import org.example.commandpattern.device.garage.GarageDoorCloseCommand;
import org.example.commandpattern.device.garage.GarageDoorOpenCommand;
import org.example.commandpattern.device.light.Light;
import org.example.commandpattern.device.light.LightOffCommand;
import org.example.commandpattern.device.light.LightOnCommand;
import org.example.commandpattern.device.stereo.Stereo;
import org.example.commandpattern.device.stereo.StereoOffCommand;
import org.example.commandpattern.device.stereo.StereoOnWithCDCommand;
import org.example.commandpattern.remote.RemoteControl;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen Light");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);

        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);

        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);

        remoteControl.undoButtonWasPressed();
    }
}

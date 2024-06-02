package org.example.commandpattern.device.light;

public class Light {
    String lightLocation;

    public Light(String lightLocation){
        this.lightLocation = lightLocation;
    }
    public void on(){
        System.out.println("Light is on!");
    }
    public void off(){
        System.out.println("Light is off!");
    }
}

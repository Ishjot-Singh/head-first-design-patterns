package org.example.commandpattern.device.stereo;

public class Stereo {
    String cd;
    int volume;
    public void setCd(String cd){
        this.cd = cd;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void on(){
        System.out.println("Stereo with CD is on!");
    }

    public void off(){
        System.out.println("Stereo with CD is off!");
    }

}

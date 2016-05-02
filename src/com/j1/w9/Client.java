package com.j1.w9;

public class Client{
  public static void main(String[] args){
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);
    GarageDoor garagedoor = new GarageDoor();
    GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garagedoor);
    GarageDoorClosedCommand garageClosed = new GarageDoorClosedCommand(garagedoor);
    
    remote.setCommand(lightOn);
    remote.buttonPressed();
    remote.setCommand(garageClosed);
    remote.buttonPressed();
  }
}
package com.j1.w10.homework;


public class RemoteControlMain{
  public static void main(String[] args){
    LightRemoteControl lightremote = new LightRemoteControl();
    GarageRemoteControl garageremote = new GarageRemoteControl();
    DVDRemoteControl dvdremote = new DVDRemoteControl();
    
    Light light = new Light("my room");
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);
    
    GarageDoor garagedoor = new GarageDoor();
    GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garagedoor);
    GarageDoorClosedCommand garageClosed = new GarageDoorClosedCommand(garagedoor);
    
    DVDplayer dvd = new DVDplayer();
    DVDplayerPlayCommand dvdPlay = new DVDplayerPlayCommand(dvd);
    DVDplayerStopCommand dvdStop = new DVDplayerStopCommand(dvd);
    
    lightremote.setCommand(0, lightOn, lightOff);
    lightremote.onButtonWasPushed(0);
    lightremote.offButtonWasPushed(0);
    lightremote.undoButtonWasPushed();

    garageremote.setCommand(1, garageOpen, garageClosed);
    garageremote.upButtonWasPushed(1);
    garageremote.downButtonWasPushed(1);
    garageremote.undoButtonWasPushed();

    dvdremote.setCommand(2, dvdPlay, dvdStop);
    dvdremote.playButtonWasPushed(2);
    dvdremote.stopButtonWasPushed(2);
    dvdremote.undoButtonWasPushed();

  }
}
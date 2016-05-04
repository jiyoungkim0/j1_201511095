package com.j1.w10;

public class RemoteLoader {
  public static void main(String[] args){
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
    
    Light g416Light = new Light("g416");
    
    LightOnCommand g416Lighton = new LightOnCommand(g416Light);
    LightOffCommand g416Lightoff = new LightOffCommand(g416Light);
    
    remoteControl.setCommand(0,g416Lighton,g416Lightoff);
    
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
  }
}
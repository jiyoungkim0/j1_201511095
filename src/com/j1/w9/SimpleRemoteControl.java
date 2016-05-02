package com.j1.w9;

public class SimpleRemoteControl {
  Command slot;
  public SimpleRemoteControl(){
  }
  public void setCommand(Command command){
    slot = command ; // study
  }
  public void buttonPressed(){
    slot.execute();
  }
}
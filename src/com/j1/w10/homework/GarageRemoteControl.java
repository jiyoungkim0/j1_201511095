package com.j1.w10.homework;


public class GarageRemoteControl {
  Command[] upCommands;
  Command[] downCommands;
  Command undoCommand;
  
  public GarageRemoteControl(){
    upCommands = new Command[7];
    downCommands = new Command[7];
    Command noCommand = new NoCommand();
    for (int i=0; i<7; i++){
      upCommands[i] = noCommand;
      downCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }
  public void setCommand(int slot, Command upCommand, Command downCommand){
    upCommands[slot] = upCommand;
    downCommands[slot] = downCommand;
  }
  public void upButtonWasPushed(int slot){
    upCommands[slot].execute();
    undoCommand = upCommands[slot];
  }
  public void downButtonWasPushed(int slot){
    downCommands[slot].execute();
    undoCommand = downCommands[slot];
  }
  public void undoButtonWasPushed(){
    undoCommand.undo();
  }
}
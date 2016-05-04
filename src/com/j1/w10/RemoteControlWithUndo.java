package com.j1.w10;

public class RemoteControlWithUndo {
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  
  public RemoteControlWithUndo() {
    onCommands = new Command[7];
    offCommands = new Command[7];
    Command noCommand = new NoCommand();
    for (int i=0; i<7; i++){
      onCommands[i] = noCommand; // null > error
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }
  public void setCommand(int slot, Command onCommand, Command offCommand){
    onCommands[slot] = onCommand; //slot = button number
    offCommands[slot] = offCommand;
  }
  // pushed "on" button
  public void onButtonWasPushed(int slot){
    onCommands[slot].execute(); //store this state
    undoCommand = onCommands[slot];
  }
  public void offButtonWasPushed(int slot){
    offCommands[slot].execute(); //store this state
    undoCommand = offCommands[slot];
  }
  public void undoButtonWasPushed(){
    undoCommand.undo(); //?? tric..
  }
}
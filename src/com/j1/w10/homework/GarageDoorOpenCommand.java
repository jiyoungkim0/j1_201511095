package com.j1.w10.homework;


public class GarageDoorOpenCommand implements Command{
  GarageDoor garagedoor;
  public GarageDoorOpenCommand(GarageDoor garagedoor){
    this.garagedoor=garagedoor;
  }
  public void execute(){
    garagedoor.up();
  }
  public void undo(){
    garagedoor.down();
  }
}
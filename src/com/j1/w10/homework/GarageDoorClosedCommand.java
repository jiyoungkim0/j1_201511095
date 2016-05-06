package com.j1.w10.homework;


public class GarageDoorClosedCommand implements Command {
  private GarageDoor garagedoor;
  public GarageDoorClosedCommand (GarageDoor garagedoor){
    this.garagedoor = garagedoor;
  }
  public void execute(){
    garagedoor.down();
  }
  public void undo(){
    garagedoor.up();
  }
}
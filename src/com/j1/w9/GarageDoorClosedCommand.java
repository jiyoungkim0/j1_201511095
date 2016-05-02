package com.j1.w9;

public class GarageDoorClosedCommand implements Command {
  GarageDoor garagedoor;
  public GarageDoorClosedCommand (GarageDoor garagedoor){
    this.garagedoor = garagedoor;
  }
  public void execute(){
    garagedoor.down();
  }
}
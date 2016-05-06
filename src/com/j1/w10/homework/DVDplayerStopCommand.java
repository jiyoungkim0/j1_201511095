package com.j1.w10.homework;


public class DVDplayerStopCommand implements Command{
  private DVDplayer dvd;
  int min;
  public DVDplayerStopCommand (DVDplayer dvd){
    this.dvd = dvd;
  }
  public void execute(){
    dvd.stop();
  }
  public void undo(){
    dvd.rewind(min);
  }
}
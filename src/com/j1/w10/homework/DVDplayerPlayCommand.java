package com.j1.w10.homework;


public class DVDplayerPlayCommand implements Command{
  private DVDplayer dvd;
  int min;
  public DVDplayerPlayCommand(DVDplayer dvd){
    this.dvd = dvd;
  }
  public void execute(){
    dvd.play();
  }
  public void undo(){
    dvd.rewind(min);
  }
}
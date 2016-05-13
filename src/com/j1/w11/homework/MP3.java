package com.j1.w11.homework;

public class MP3{
  String mine;
  public MP3(String mine){
    this.mine=mine;
  }
  public void on(){
    System.out.println(mine+" MP3 is on.");
  }
  public void off(){
    System.out.println(mine+" MP3 is off.");
  }
  public void play(){
    System.out.println(mine + " MP3 is now playing.");
  }
  public void stop(){
    System.out.println(mine + " MP3 stopped.");
  }
  public void setVolume(int level){
    System.out.println(mine+" mp3 is setting volume to "+ level);
  }
  public String toString(){
    return mine;
  }
}
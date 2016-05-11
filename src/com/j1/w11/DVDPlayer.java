package com.j1.w11;

public class DVDPlayer{
  String name;
  String thing;
  Amplifier amp;
  public DVDPlayer(String name, Amplifier amp){
    this.name=name;
    this.amp=amp;
  }
  public void on(){
    System.out.println(name+" on");
  }
  public void off(){
    System.out.println(name+" off");
  }
  public void play(String thing){
    this.thing = thing;
    System.out.println(name+" start "+thing);
  }
  public void stop(){
    System.out.println("Stop "+name+" !");
  }
  public void eject(){
    thing = null;
    System.out.println(name+" eject.");
  }
  public String toString(){
    return name;
  }
}
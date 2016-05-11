package com.j1.w11;

public class Amplifier {
  String name;
  Tuner tuner;
  DVDPlayer dvd;
  public Amplifier(String name){
    this.name = name;
  }
  public void on(){
    System.out.println(name+" on");
  }
  public void off(){
    System.out.println(name+" off");
  }
  public void setDvd(DVDPlayer dvd){
    System.out.println(name + " setting DVD player to " + tuner);
    this.dvd = dvd;
  }
  public void setVolume(int level){
    System.out.println(name+" setting volume to "+ level);
  }
  public String toStirng(){
    return name;
  }
}
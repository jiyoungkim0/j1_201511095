package com.j1.w11;

public class Projector{
  String name;
  DVDPlayer dvd;
  public Projector(String name, DVDPlayer dvd){
    this.name =name;
    this.dvd=dvd;
  }
  public void on(){
    System.out.println(name+" on");
  }
  public void off(){
    System.out.println(name+" on");
  }
  public void wideScreenMode(){
    System.out.println(name+" screen is wided");
  }
  public String toString(){
    return name;
  }
}
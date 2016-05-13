package com.j1.w11.homework;

public class SmartHomeMain{
  public static void main(String[] args){
    Light light = new Light("JY's room");
    MP3 mp3 = new MP3("JY's");
    Notebook notebook = new Notebook("JY's");
    Smartphone phone = new Smartphone("JY's");
    TV tv = new TV("Living room");
    SmartHome home = new SmartHome(light,mp3,notebook,phone,tv);
    home.beginStudy();
    home.endStudy();
  }
}
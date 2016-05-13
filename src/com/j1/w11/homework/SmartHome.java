package com.j1.w11.homework;

public class SmartHome {
  private Light light;
  private MP3 mp3;
  private Notebook notebook;
  private Smartphone phone;
  private TV tv;
  public SmartHome (Light light, MP3 mp3, Notebook notebook, Smartphone phone, TV tv){
    this.light = light;
    this.mp3 = mp3;
    this.notebook = notebook;
    this.phone = phone;
    this.tv = tv;
  }
  public void beginStudy(){
    System.out.println("Let's start study!");
    light.on();
    mp3.on();
    mp3.play();
    mp3.setVolume(17);
    notebook.on();
    phone.doNotDisturbMode();
    tv.off();
    System.out.println("I'm studying...");
  }
  public void endStudy(){
    System.out.println("Burnd white...");
    light.on();
    mp3.stop();
    mp3.off();
    notebook.on();
    phone.doDisturbMode();
    tv.off();
  }
}
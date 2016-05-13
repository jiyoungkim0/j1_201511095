package com.j1.w11.homework;

public class Light{
  String location;
  public Light(String location){
    this.location = location ;
  }
  public void on(){
    System.out.println(location + " light is on.");
  }
  public void of(){
  System.out.println(location + " light is off.");
  }
  public String toStirng(){
    return location;
  }
}
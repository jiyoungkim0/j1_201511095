package com.j1.w11.homework;

public class TV{
  String location;
  public TV(String location){
    this.location = location;
  }
  public void on(){
    System.out.println(location + " tv is on.");
  }
  public void off(){
    System.out.println(location + " tv is off.");
  }
  public String toString(){
    return location;
  }
}
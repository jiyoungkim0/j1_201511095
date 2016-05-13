package com.j1.w11.homework;

public class Smartphone{
  String mine;
  public Smartphone(String mine){
    this.mine=mine;
  }
  public void on(){
    System.out.println(mine + " phone is on.");
  }
  public void off(){
    System.out.println(mine + " phone is on.");
  }
  public void doNotDisturbMode(){
    System.out.println(mine + " phone is 'do not disturb mode'.");
  }
  public void doDisturbMode(){
    System.out.println(mine + " phone is normal");
  }
  public String toString(){
    return mine;
  }
}
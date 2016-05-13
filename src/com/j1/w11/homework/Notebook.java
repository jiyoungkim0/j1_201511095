package com.j1.w11.homework;

public class Notebook {
  String mine;
  public Notebook (String mine){
    this.mine=mine;
  }
  public void on(){
    System.out.println(mine + " notebook is on.");
  }
  public void off(){
    System.out.println(mine + " notebook is off.");
  }
  public void waitMode(){
    System.out.println(mine + " notebook is waiting...");
  }
  public String toStriong(){
    return mine;
  }
}
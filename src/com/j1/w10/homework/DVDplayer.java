package com.j1.w10.homework;


public class DVDplayer{
  int min;
  public DVDplayer(){}
  public void play(){
    System.out.println("DVD starts!");
  }
  public void stop(){
    System.out.println("DVD is stopped!");
  }
  public void rewind(int min){
    this.min = min;
    if(min == 0){
      stop();
    }
    else{
      System.out.println("rewind "+min+"min.");
    }
  }
  public int getMin(){
    return min;
  }
}
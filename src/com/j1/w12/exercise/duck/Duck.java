package com.j1.w12.exercise.duck;

public class Duck implements Comparable {
  String name;
  int weight;
  int volume;
  public Duck(String name, int weight, int volume) {
    this.name = name;
    this.weight = weight;
    this.volume = volume;
  }
  public String toString() {
    return name + "'s volume is " + volume;
  }
  public int compareTo(Object object) {
    int result =0;
    Duck otherDuck = (Duck)object;
    if (this.volume < otherDuck.volume) {
      result =-1;
    } else if (this.volume == otherDuck.volume) {
      result =0;
    } else { 
      result =1;
    }
    return result;
  }
}

package com.j1.w12.exercise.sort;

public class Volume implements Comparable {
  String name;
  int voice;
  
  public Volume(String name, int voice) {
    this.name = name;
    this.voice = voice;
 }
  
  public String toString() {
    return "Volume of " + name +" is " + voice + ".";
 }
  
  public int compareTo(Object object) {
    int result = 0;
    Volume otherVoice = (Volume)object;
    if (this.voice < otherVoice.voice) {
      result = -1;
    } else if (this.voice == otherVoice.voice) {
      result = 0;
    } else {
      result = 1;
    }
    return result;
  }
}

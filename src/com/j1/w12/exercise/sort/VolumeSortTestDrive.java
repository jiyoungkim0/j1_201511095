package com.j1.w12.exercise.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class VolumeSortTestDrive {
  public static void main(String[] args) {
    Volume[] person = { 
      new Volume("jyung", 68), 
      new Volume("chaechae", 72),
      new Volume("dada", 67),
      new Volume("papa", 71),
      new Volume("mama", 60), 
      new Volume("jjun", 75)
    };

  System.out.println("Before sorting:");
  display(person);

  Arrays.sort(person);
 
  System.out.println("\nAfter sorting:");
  display(person);
 }

 public static void display(Volume[] person) {
  for (int i = 0; i < person.length; i++) {
   System.out.println(person[i]);
  }
 }
}

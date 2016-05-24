package com.j1.w12.exercise.duck;

import java.util.ArrayList;
import java.util.Arrays;

public class DuckSortTestDrive {
  public static void main(String[] args) {
    Duck[] ducks = { 
      new Duck("jyung", 50, 80), 
      new Duck("chaechae", 70, 97),
      new Duck("dada", 50, 85),
      new Duck("mama", 45, 88),
      new Duck("papa", 70, 75), 
      new Duck("jjun", 50, 92)
    };
    
    System.out.println("Before sorting:");
    display(ducks);
    
    Arrays.sort(ducks);
    
    System.out.println("\nAfter sorting:");
    display(ducks);
 }
  
 public static void display(Duck[] ducks) {
   for (int i = 0; i < ducks.length; i++) {
   System.out.println(ducks[i]);
   }
 }
}

package com.j1.w12;

import java.util.*;

public class DuckSortTestDrive {
  public static void main(String[] args){
    Duck[] ducks = {new Duck("a",10), 
                    new Duck("b",4), 
                    new Duck("c",7), 
                    new Duck("d",8)
                   };
    Arrays.sort(ducks);
    display(ducks);
    
    Duck[] myDucks = {new Duck("Sang",8), new Duck("Myung",2), new Duck("Uni", 7)};
    Arrays.sort(myDucks, new DuckComparator());
    display(myDucks);
  }
  public static void display(Duck[] ducks){
    for (int i=0; i<ducks.length; i++){
      System.out.println(ducks[i]);
    }
  }
}
package com.j1.w12.exercise.coffee;

import java.io.*;

public class CaramelWithHook extends CaffeineBeverageWithHook {
  public void brew() {
    System.out.println("Dripping Coffee through filter");
  }
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk and Caramel-syrub");
  }
  public boolean customerWantsCondiments() {
    String answer = getUserInput();
    if (answer.toLowerCase().startsWith("y")) {
      return true;
    } else {
      return false;
    }
  }
  private String getUserInput() {
    String answer = null;
    System.out.print("Would you like milk and sugar and caramel syrub with your coffee (y/n)? ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException ioe) {
      System.err.println("IO error trying to read your answer");
    }
    if (answer == null) {
      return "no";
    }
    return answer;
  }
}

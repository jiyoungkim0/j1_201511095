package com.j1.w11.template2.hook;

import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("Grinding coffee.");
  }
  public void addCondiments(){
    System.out.println("Adding milk.");
  }
  public boolean customerWantsCondiments(){
    String answer = getUserInput();
    if(answer.toLowerCase().startsWith("y")){
      return true;
    }
    else {
      return false;
    }
  }
  private String getUserInput(){
    String answer = null;
    System.out.print("Would you like milk and sugar with your coffee (y/n)?");
    BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    }
    catch (IOException ioe){
      System.out.println("IO error trying to read your answer");
    }
    if(answer == null){
      return "no";
    }
    return answer;
  }
}
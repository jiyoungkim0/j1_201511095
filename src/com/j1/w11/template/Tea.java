package com.j1.w11.template;

public class Tea {
  void prepareRecipe(){
    boilWater();
    steepTeaBag();
    pourInCup();
    addLemon();
  }
  public void boilWater(){
    System.out.println("Boiling water.");
  }
  public void steepTeaBag(){
    System.out.println("Steeping tea bag.");
  }
  public void pourInCup(){
    System.out.println("Puring in Cup.");
  }
  public void addLemon(){
    System.out.println("Adding Lemon.");
  }
}
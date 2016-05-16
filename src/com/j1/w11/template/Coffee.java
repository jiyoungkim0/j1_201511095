package com.j1.w11.template;

public class Coffee{
  // common 
  void prepareRecipe(){
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  public void boilWater(){
    System.out.println("Boiling water.");
  }
  public void brewCoffeeGrinds(){
    System.out.println("Grinding coffee.");
  }
  public void pourInCup(){
    System.out.println("Puring in Cup.");
  }
  public void addSugarAndMilk(){
    System.out.println("Adding Sugar & Milk.");
  }
}
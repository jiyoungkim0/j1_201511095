package com.j1.w11.template2;

public abstract class CaffeineBeverage {
  // return :void, final
  public final void prepareRecipe(){
    //cannot changed
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  abstract void brew();
  abstract void addCondiments();
  void boilWater(){
    System.out.println("Boiling water.");
  }
  void pourInCup(){
    System.out.println("Puring in Cup.");
  }
}
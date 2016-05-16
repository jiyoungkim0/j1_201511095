package com.j1.w11.template2.hook;

public abstract class CaffeineBeverageWithHook {
  // return :void, final
  public final void prepareRecipe(){
    //cannot changed
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments()){
      addCondiments();
    }
  }
  abstract void brew();
  abstract void addCondiments();
  void boilWater(){
    System.out.println("Boiling water.");
  }
  void pourInCup(){
    System.out.println("Puring in Cup.");
  }
  boolean customerWantsCondiments(){
    return true;
  }
}
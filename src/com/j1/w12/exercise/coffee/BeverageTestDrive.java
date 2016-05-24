package com.j1.w12.exercise.coffee;

public class BeverageTestDrive {
  public static void main(String[] args) {
    
  CoffeeWithHook coffeeHook = new CoffeeWithHook();
  System.out.println("Making coffee...");
  coffeeHook.prepareRecipe();
  
  CaramelWithHook caramelHook = new CaramelWithHook();
  System.out.println("\nMaking coffee...");
  caramelHook.prepareRecipe();
 }
}

package com.j1.w11.template;

public class Barista{
  public static void main(String[] args){
    Tea tea = new Tea();
    tea.prepareRecipe();
    System.out.println("--------------------");
    Coffee coffee = new Coffee();
    coffee.prepareRecipe();
  }
}
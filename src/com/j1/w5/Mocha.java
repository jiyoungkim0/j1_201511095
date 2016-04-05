package com.j1.w5;

public class Mocha extends CondimentDecorator {
  Beverage beverage; //이건 왜 하는거징..?//
  
  public Mocha(Beverage beverage){
    this.beverage = beverage; //.this 복습하기//
  }
  
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
  
  public double cost() {
    return .20 + beverage.cost();
  }
}
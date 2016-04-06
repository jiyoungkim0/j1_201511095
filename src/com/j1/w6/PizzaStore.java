package com.j1.w6;

public class PizzaStore {
  SimplePizzaFactory factory;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory=factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza = null;
    pizza=factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut(); //이렇게 부르는 거? 다형성!(DMI :다이나믹  메소드  임보케이션//
    pizza.box();
    return pizza;
  }
}
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
    pizza.cut(); //�̷��� �θ��� ��? ������!(DMI :���̳���  �޼ҵ�  �Ӻ����̼�//
    pizza.box();
    return pizza;
  }
}
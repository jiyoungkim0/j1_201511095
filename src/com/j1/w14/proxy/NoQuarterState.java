package com.j1.w14.proxy;

public class NoQuarterState implements State{
  transient GumballMachine gumballMachine;
  
  public NoQuarterState(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter(){
    System.out.println("You insert quarter.");
    gumballMachine.setState(gumballMachine.getSoldOutState());
  }
  public void ejectQuarter(){
    System.out.println("There is no quater.");
  }
  public void turnCrank(){
    System.out.println("There is no quater.");
  }
  public void dispense(){
    System.out.println("You need to pay first.");
  }
}
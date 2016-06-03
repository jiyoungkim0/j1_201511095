package com.j1.w14.state.after;

public class SoldOutState implements State{
  GumballMachine gumballMachine;
  
  public SoldOutState(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter(){
    System.out.println("There is no gumball.");
  }
  public void ejectQuarter(){
    System.out.println("Quarter returned");
  }
  public void turnCrank(){
    System.out.println("You turned..., Quarter returned");
  }
  public void dispense(){
    System.out.println("No gumball dispensed.");
  }
}
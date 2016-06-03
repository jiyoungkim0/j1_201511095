package com.j1.w14.state.exercise;

public class HasWrongQuarterState implements State{
  GumballMachine gumballMachine;
  
  public HasWrongQuarterState(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter(){
    System.out.println("You insert wrong quarter.");
  }
  public void ejectQuarter(){
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank(){
    System.out.println("You insert wrong quarter.");
    gumballMachine.setState(gumballMachine.getErrorState());
  }
  public void dispense(){
    System.out.println("No gumball dispensed.");
  }
}
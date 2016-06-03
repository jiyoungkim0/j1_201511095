package com.j1.w14.state.exercise;

public class HasQuarterState implements State{
  GumballMachine gumballMachine;
  
  public HasQuarterState(GumballMachine gumballMachine){
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter(){
    System.out.println("You cannot insert another quarter.");
  }
  public void ejectQuarter(){
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank(){
    System.out.println("You turned...");
    //after crank, change state
    gumballMachine.setState(gumballMachine.getSoldState());
  }
  public void dispense(){
    System.out.println("No gumball dispensed.");
  }
}
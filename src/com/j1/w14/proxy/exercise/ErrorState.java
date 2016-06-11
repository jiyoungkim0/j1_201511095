package com.j1.w14.proxy.exercise;

public class ErrorState implements State{ 
  GumballMachine gumballMachine; 
    
  public ErrorState(GumballMachine gumballMachine){ 
    this.gumballMachine = gumballMachine; 
  } 
   
  public void insertQuarter(){ 
    System.out.println("You insert quarter."); 
  } 
  public void ejectQuarter(){ 
    System.out.println("You can insert another quarter."); 
    gumballMachine.setState(gumballMachine.getNoQuarterState()); 
  } 
  public void turnCrank(){ 
    System.out.println("There are worng quarters."); 
  } 
  public void dispense(){ 
    System.out.println("You need to pay another quarter first."); 
  } 
} 

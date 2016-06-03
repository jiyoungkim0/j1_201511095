package com.j1.w14.state.exercise;

public class GumballMachineTestDrive{
  public static void main(String[] args){
    GumballMachine gumballMachine = new GumballMachine(5);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
  }
}
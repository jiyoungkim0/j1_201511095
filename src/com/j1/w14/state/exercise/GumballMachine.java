package com.j1.w14.state.exercise;

public class GumballMachine {
  //final static int SOLD_OUT=0;
  State soldOutState;
  //final static int NO_QUARTER=1;
  State noQuarterState;
  //final static int HAS_QUARTER=2;
  State hasQuarterState;
  //final static int SOLD=3;
  State soldState;
  State hasWrongQuarterState;
  State errorState;
  
  //int state=SOLD_OUT; //randomly
  State state=soldOutState;
  int count=0;
  
  public GumballMachine(int count){
    soldOutState=new SoldOutState(this);
    noQuarterState=new NoQuarterState(this);
    hasQuarterState=new HasQuarterState(this);
    soldState=new SoldState(this);
    hasWrongQuarterState=new HasWrongQuarterState(this);
    errorState=new ErrorState(this);
    
    this.count=count;
    if (count > 0) {
      //state=NO_QUARTER; // 0 >> 1
      state=noQuarterState;
    }
  }
  public void insertQuarter(){
    state.insertQuarter();
  }
  public void ejectQuarter(){
    state.ejectQuarter();
  }
  public void turnCrank(){
    state.turnCrank();
    state.dispense();
  }
  public void setState(State state){
    this.state=state;
  }
  void releaseBall(){
    System.out.println("A gumball comes rolling out the slot...");
    if(count !=0){
      count = count -1;
    }
  }
  int getCount(){
    return count;
  }
  void refill(int count){
    this.count = count;
    state = noQuarterState;
  }
  public State getState(){
    return state;
  }
  public State getSoldOutState(){
    return soldOutState;
  }
  public State getNoQuarterState(){
    return noQuarterState;
  }
  public State getHasQuarterState(){
    return hasQuarterState;
  }
  public State getSoldState(){
    return soldState;
  }
  public State getHasWrongQuarterState(){
    return hasWrongQuarterState;
  }
  public State getErrorState(){
    return errorState;
  }
}
package com.j1.w13.state;

public class GumballMachine {
  final static int SOLD_OUT=0;
  final static int NO_QUARTER=1;
  final static int HAS_QUARTER=2;
  final static int SOLD=3;
  
  int state=SOLD_OUT; //randomly
  
  int count=0;
  public GumballMachine(int count){
    this.count=count;
    if (count > 0) {
      state=NO_QUARTER; // 0 >> 1
    }
  }
  public void insertQuarter(){ // state change
    if(state==HAS_QUARTER){
      System.out.println("You can not insert another quarter.");
    }
    else if(state==NO_QUARTER){
      state = HAS_QUARTER; //?
      System.out.println("You inserted another quarter.");
    }
    else if(state==SOLD_OUT){
      System.out.println("You cannot insert. Sold out.");
    }
    else if(state==SOLD){
      System.out.println("Wait. We have already given a gumball");
    }
  }
  public void ejectQuarter(){
    if(state==HAS_QUARTER){
      System.out.println("Quarter returned.");
      state = NO_QUARTER;
    }
    else if(state==NO_QUARTER){
      System.out.println("You haven't inserted a quarter.");
    }
    else if(state==SOLD_OUT){
      System.out.println("You cas't eject, you haven't inserted a quarter yet.");
    }
    else if(state==SOLD){
      System.out.println("Sorry, you already turned the crank.");
    }
  }
  public void turnCrank(){
    if(state==HAS_QUARTER){
      System.out.println("You turned...");
      state = SOLD;
      dispense();
    }
    else if(state==NO_QUARTER){
      state = HAS_QUARTER; //?
      System.out.println("You turned but there's no quarter.");
    }
    else if(state==SOLD_OUT){
      System.out.println("You turned, but there are no gumball.");
    }
    else if(state==SOLD){
      System.out.println("Turning twice doesn't get you another gumball!");
    }
  }
  public void dispense(){
    if(state==HAS_QUARTER){
      System.out.println("No gumball dispensed.");
    }
    else if(state==NO_QUARTER){
      state = HAS_QUARTER; //?
      System.out.println("You need to pay first.");
    }
    else if(state==SOLD_OUT){
      System.out.println("No gumball dispensed.");
    }
    else if(state==SOLD){
      System.out.println("A gumball comes rolling out the slot.");
      count = count - 1;
      if(count ==0){
        System.out.println("Oops, out of gumballs!");
        state = SOLD_OUT;
    }
      else{
        state = NO_QUARTER;
      }
    }
  }
}
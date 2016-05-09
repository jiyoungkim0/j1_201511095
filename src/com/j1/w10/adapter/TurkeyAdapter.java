package com.j1.w10.adapter;

public class TurkeyAdapter implements Duck {
  Turkey turkey;
  public TurkeyAdapter(Turkey turkey){
    this.turkey = turkey;
  }
  public void quack(){
    turkey.gobble();
  }
  public void fly(){
  }
}
package com.j1.w13.Iterator;

public class Waitress {
  PancakeHouseMenu phm;
  DinerMenu dm;
  
  public Waitress(PancakeHouseMenu p, DinerMenu d){
    this.phm =p;
    this.dm=d;
  }
  
  public void printMenu(){
    Iterator pi = phm.creatIterator();
    printMenu(pi);
    Iterator di = dm.creatIterator();
    printMenu(di);
  }
  
  private void printMenu(Iterator iterator){
    while(iterator.hasNext()){
      MenuItem menuItem = (MenuItem)iterator.next();
      System.out.println(menuItem.getName());
    }
  }
}
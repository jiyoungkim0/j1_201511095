package com.j1.w13.Iterator.dinermenu.after;

public class Waitress {
  PancakeHouseMenu phm;
  DinerMenu dm;
  
  public Waitress(PancakeHouseMenu p, DinerMenu d){
    this.phm =p;
    this.dm=d;
  }
  
  public void printMenu(){
    Iterator pi = phm.creatIterator();
    System.out.println("----------Pancake House Menu----------");
    printMenu(pi);
    Iterator di = dm.creatIterator();
    System.out.println("----------Diner Menu----------");
    printMenu(di);
  }
  
  private void printMenu(Iterator iterator){
    while(iterator.hasNext()){
      MenuItem menuItem = (MenuItem)iterator.next();
      System.out.println(menuItem.getName());
    }
  }
}
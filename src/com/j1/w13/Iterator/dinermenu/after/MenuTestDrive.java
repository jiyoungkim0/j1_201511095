package com.j1.w13.Iterator.dinermenu.after;

public class MenuTestDrive{
  public static void main(String[] args){
    PancakeHouseMenu phm = new PancakeHouseMenu();
    DinerMenu dm = new DinerMenu();
    Waitress w = new Waitress(phm,dm);
    w.printMenu();
  }
}
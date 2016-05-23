package com.j1.w12;

public class DinerMenu {
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("A","...",true,2.99);
    addItem("B","...",false,3.99);
    addItem("C","...",false,3.49);
  }
  
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description, v, p);
    if (numberOfItems>=MAX_ITEMS) {
      System.out.println("Error");
    }else {
      menuItems[0]= menuItem;
      numberOfItems = numberOfItems+1;
    }
  }
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
}
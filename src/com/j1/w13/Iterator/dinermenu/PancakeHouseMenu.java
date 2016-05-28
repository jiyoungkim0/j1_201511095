package com.j1.w13.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
  ArrayList menuItems;
  //static final int MAX_ITEMS=3;
  //int numberOfItems=0;
  //MenuItem[] menuItems;
  public PancakeHouseMenu(){
    //menuItems = new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList();
    addItem("A","...",true,2.99);
    addItem("B","...",false,3.99);
    addItem("C","...",false,3.49);
  }
  
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description, v, p);
    //if (numberOfItems>=MAX_ITEMS) {
    //  System.out.println("Error");
    //}else {
    //  menuItems[0]= menuItem;
    //  numberOfItems = numberOfItems+1;
    //}
    menuItems.add(menuItem);
  }
  public ArrayList getMenuItems(){
    return menuItems;
  }
  public Iterator creatIterator(){
    return new PancakeHouseMenuIterator(menuItems);
  }
}
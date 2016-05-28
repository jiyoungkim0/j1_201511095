package com.j1.w13.Iterator.dinermenu.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
  ArrayList menuItems;

  public PancakeHouseMenu(){
    menuItems = new ArrayList();
    addItem("바닐라 팬케이크","바닐라, 팬케이크",true,3.59);
    addItem("딸기 팬케이크","딸기, 팬케이크",true,3.99);
    addItem("망고 팬케이크","망고, 팬케이크",true,4.29);
    addItem("아이스크림 와플","바닐라 아이스크림 1스쿱, 초코 아이스크림 1스쿱, 와플 2장, 생크림, 꿀",true,5.49);
  }
  
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description, v, p);
    menuItems.add(menuItem);
  }
  public ArrayList getMenuItems(){
    return menuItems;
  }
  public Iterator creatIterator(){
    return new PancakeHouseMenuIterator(menuItems);
  }
}
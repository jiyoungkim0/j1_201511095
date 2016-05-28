package com.j1.w13.Iterator;

public class DinerMenu implements Menu{
  static final int MAX_ITEMS=6;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("불고기버거","(햄버거 빵 2장, 양상추, 불고기 패티 1개)",false,2.49);
    addItem("더블불고기버거","(햄버거 빵 2장, 양상추, 불고기 패티 2개)",false,2.99);
    addItem("새우버거","(햄버거 빵 2장, 새우 패티 1개, 치즈 1장",false,3.49);
    addItem("치킨버거","(햄버거 빵 2장, 치킨 패티 1개, 양상추)",false,3.49);
    addItem("매운치킨버거","(햄버거 빵 2장, 매운치킨 패티 1개, 양상추)",false,3.49);
    addItem("콩고기버거","(햄버거 빵 2장, 양상추, 콩 패티 1개)",true,2.99);
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
  public Iterator creatIterator(){
    return new DinerMenuIterator(menuItems);
  }
}